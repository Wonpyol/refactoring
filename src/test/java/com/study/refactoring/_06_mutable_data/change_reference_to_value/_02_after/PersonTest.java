package com.study.refactoring._06_mutable_data.change_reference_to_value._02_after;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    void findOfficeAreaCode() {
        Person person = new Person(new TelephoneNumber("031", "010-7777-7777"));
        Assertions.assertEquals("031", person.findOfficeAreaCode());
    }
    @Test
    void officeAreaCode() {
        Person person = new Person(new TelephoneNumber("031", "010-7777-7777"));
        person.officeAreaCode("033");
        Assertions.assertEquals("033", person.findOfficeAreaCode());
    }

    @Test
    void findOfficeNumber() {
        Person person = new Person(new TelephoneNumber("031", "010-7777-7777"));
        Assertions.assertEquals("010-7777-77777", person.findOfficeNumber());
    }

    @Test
    void officeNumber() {
        Person person = new Person(new TelephoneNumber("031", "010-7777-7777"));
        person.officeNumber("010-7777-9999");
        Assertions.assertEquals("010-7777-9999", person.findOfficeNumber());
    }

}