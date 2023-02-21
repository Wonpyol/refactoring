package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.indirect_inheritance._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void validate_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Employee("wonypol", "ceo"));
    }

    @Test
    void capitalizedType() {
        Employee employee = new Manager("wonpyol");

        assertEquals("Manager", employee.capitalizedType());
    }


}