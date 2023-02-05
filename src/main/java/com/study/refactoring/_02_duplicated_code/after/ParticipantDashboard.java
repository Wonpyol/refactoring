package com.study.refactoring._02_duplicated_code.after;

import java.io.IOException;

public class ParticipantDashboard extends Dashboard {
    public void printParticipants(int eventId) throws IOException {
        super.printUserNames(eventId);
    }
}
