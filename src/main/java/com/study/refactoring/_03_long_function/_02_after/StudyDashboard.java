package com.study.refactoring._03_long_function._02_after;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudyDashboard {

    private final int totalEvents;
    private List<Participant> participants;

    public StudyDashboard(int totalEvents, List<Participant> participants) {
        this.totalEvents = totalEvents;
        this.participants = participants;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        StudyDashboard studyDashboard = new StudyDashboard(1, new CopyOnWriteArrayList<>());
        studyDashboard.print();
    }

    private void print() throws IOException, InterruptedException {
        GHRepository repository = getRepository();
        checkGithubIssues(repository);
        new StudyPrinter().execute(this.participants, this.totalEvents);
    }

    private void checkGithubIssues(GHRepository repository) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(8);
        CountDownLatch latch = new CountDownLatch(this.totalEvents);

        for (int index = 1 ; index <= this.totalEvents ; index++) {
            int eventId = index;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        GHIssue issue = repository.getIssue(eventId);
                        List<GHIssueComment> comments = issue.getComments();
                        checkHomework(comments, participants, eventId);
                        latch.countDown();
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            });
        }
        latch.await();
        service.shutdown();
    }

    private void checkHomework(List<GHIssueComment> comments, List<Participant> participants, int eventId) {
        for (GHIssueComment comment : comments) {
            Participant participant = getParticipant(comment, participants);
            participant.setHomeworkDone(eventId);
        }
    }

    private Participant getParticipant(GHIssueComment comment, List<Participant> participants) {
        return isNewUser(participants, comment.getUserName()) ?
                createParticipant(participants, comment.getUserName()) :
                getParticipant(participants, comment.getUserName());
    }

    private Participant getParticipant(List<Participant> participants, String username) {
        Participant participant;
        participant = participants.stream().filter(p -> p.username().equals(username)).findFirst().orElseThrow();
        return participant;
    }

    private Participant createParticipant(List<Participant> participants, String username) {
        Participant participant;
        participant = new Participant(username);
        participants.add(participant);
        return participant;
    }

    private boolean isNewUser(List<Participant> participants, String username) {
        return participants.stream().noneMatch(p -> p.username().equals(username));
    }

    private GHRepository getRepository() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("Wonpyol/refactoring");
        return repository;
    }
}
