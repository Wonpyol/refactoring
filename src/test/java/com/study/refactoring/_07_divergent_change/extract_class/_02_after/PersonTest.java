package com.study.refactoring._07_divergent_change.extract_class._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void telephoneNumber() {
        TelephoneNumber telephoneNumber = new TelephoneNumber("010", "7777-7777");
        Person person = new Person(telephoneNumber, "Wonpyol");

        assertEquals("010-7777-7777", person.telephoneNumber());
    }

    @Test
    void name() {
        TelephoneNumber telephoneNumber = new TelephoneNumber("010", "7777-7777");
        Person person = new Person(telephoneNumber, "Wonpyol");

        assertEquals("Wonpyol", person.name());
    }

}