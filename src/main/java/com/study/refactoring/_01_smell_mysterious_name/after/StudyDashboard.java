package com.study.refactoring._01_smell_mysterious_name.after;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudyDashboard {
    private Set<StudyReview> studyReviews = new HashSet<>(); //rename field
    private void loadReviews() throws IOException { //change method declaration
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("Wonpyol/refactoring");
        GHIssue issue = repository.getIssue(1);

        List<GHIssueComment> reviews = issue.getComments(); //rename varialbe
        for (GHIssueComment review : reviews) {
            studyReviews.add(new StudyReview(review.getUserName(), review.getBody()));
        }
    }

    public Set<StudyReview> getStudyReviews() {
        return studyReviews;
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();
        studyDashboard.getStudyReviews().forEach(System.out::println);
    }
}
