package com.study.refactoring._07_divergent_change.extract_class._02_after;

public class Person {

    private TelephoneNumber telephoneNumber;
    private String name;

    public Person(TelephoneNumber telephoneNumber, String name) {
        this.telephoneNumber = telephoneNumber;
        this.name = name;
    }

    public String telephoneNumber() {
        return this.telephoneNumber.toString();
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
