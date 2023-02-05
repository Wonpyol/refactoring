package com.study.refactoring._02_duplicated_code.after;

import java.io.IOException;

public class ReviewerDashboard extends Dashboard {
    public void printReviewers() throws IOException {
        super.printUserNames(1);
    }
}
