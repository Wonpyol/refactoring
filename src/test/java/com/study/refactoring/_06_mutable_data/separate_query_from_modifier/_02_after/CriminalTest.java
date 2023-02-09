package com.study.refactoring._06_mutable_data.separate_query_from_modifier._02_after;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CriminalTest {
    @Test
    void findForMiscreant() {
        List<Person> persons = Arrays.asList(
                new Person("Don"),
                new Person("Wonpyo"));
        Criminal criminal = new Criminal();
        assertEquals("Don", criminal.findForMiscreant(persons));

        persons = Arrays.asList(
                new Person("John"),
                new Person("Wonpyo"));
        criminal = new Criminal();
        assertEquals("John", criminal.findForMiscreant(persons));

        persons = Arrays.asList(
                new Person("Wonpyo"));
        criminal = new Criminal();
        assertEquals("", criminal.findForMiscreant(persons));
    }


}