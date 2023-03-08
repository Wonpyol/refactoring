package com.study.refactoring._23_refused_bequest._02_after;

public class Salesman extends Employee {
    //상속포기
    protected Quota quota;

    protected Quota getQuota() {
        return new Quota();
    }
}

