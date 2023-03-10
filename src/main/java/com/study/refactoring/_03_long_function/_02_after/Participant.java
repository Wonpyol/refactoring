package com.study.refactoring._03_long_function._02_after;

import java.util.HashMap;
import java.util.Map;

public record Participant(String username, Map<Integer, Boolean> homework) { //매개변수 객체 만들기
    public Participant(String username) {
        this(username, new HashMap<>());
    }
    public void setHomeworkDone(int index) {
        this.homework.put(index, true);
    }
}
