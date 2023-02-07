package com.study.refactoring._02_duplicated_code._02_after;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Dashboard {
    public static void main(String[] args) throws IOException {
        ParticipantDashboard participantDashboard = new ParticipantDashboard();
        participantDashboard.printParticipants(1);//pull up method

        ReviewerDashboard reviewerDashboard = new ReviewerDashboard();
        reviewerDashboard.printReviewers();//pull up method
    }

    public void printUserNames(int eventId) throws IOException {
        GHIssue issue = getGhIssue(eventId); //extract method
        Set<String> userNames = getUserNames(issue); //extract method
        print(userNames); //extract method
    }

    private void print(Set<String> userNames) {
        userNames.forEach(System.out::println);
    }

    private Set<String> getUserNames(GHIssue issue) throws IOException {
        Set<String> userNames = new HashSet<>();
        issue.getComments().forEach(c -> userNames.add(c.getUserName()));
        return userNames;
    }

    private GHIssue getGhIssue(int eventId) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("Wonpyol/refactoring");
        GHIssue issue = repository.getIssue(eventId);
        return issue;
    }
}
