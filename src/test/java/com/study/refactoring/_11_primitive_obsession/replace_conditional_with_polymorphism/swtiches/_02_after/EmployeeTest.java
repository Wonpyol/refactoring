package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.swtiches._02_after;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private List<String> list;

    @BeforeEach
    void init() {
        list = List.of("java", "c");
    }
    @Test
    void vacationHours() {
        assertEquals(120, new FullTimeEmployee(list).vacationHours());
    }

    @Test
    void canAccessTo() {
        assertFalse(new HalfTimeEmployee(list).canAccessTo("jpa"));
        assertTrue(new HalfTimeEmployee(list).canAccessTo("java"));
    }

}