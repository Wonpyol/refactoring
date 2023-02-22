package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.swtiches._02_after;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void fulltime() {
        List<String> projects = List.of("java", "c");
        assertEquals(120, new FullTimeEmployee().vacationHours());
        assertTrue(new FullTimeEmployee().canAccessTo("java"));
    }

    @Test
    void halftime() {
        List<String> projects = List.of("java", "c");
        assertEquals(80, new HalfTimeEmployee(projects).vacationHours());
        assertTrue(new HalfTimeEmployee(projects).canAccessTo("java"));
        assertFalse(new HalfTimeEmployee(projects).canAccessTo("jpa"));
    }

    @Test
    void temporal() {
        List<String> projects = List.of("java", "c");
        assertEquals(32, new TemporalEmployee(projects).vacationHours());
        assertTrue(new TemporalEmployee(projects).canAccessTo("java"));
        assertFalse(new TemporalEmployee(projects).canAccessTo("jpa"));
    }

}