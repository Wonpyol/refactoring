package com.study.refactoring._06_mutable_data.separate_query_from_modifier._02_after;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
