package com.study.refactoring._03_long_function._02_after;

import java.util.HashMap;
import java.util.Map;

public record Participant(String username, Map<Integer, Boolean> homework) {
    public Participant(String username) {
        this(username, new HashMap<>());
    }
    public void setHomeworkDone(int index) {
        this.homework.put(index, true);
    }

    double getRate(double totalEvents) {
        long count = homework().values().stream()
                .filter(v -> v == true)
                .count();
        double rate = count * 100 / totalEvents;
        return rate;
    }
}
