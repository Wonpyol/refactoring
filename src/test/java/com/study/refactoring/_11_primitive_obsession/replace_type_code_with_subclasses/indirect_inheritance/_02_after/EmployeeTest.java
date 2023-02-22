package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.indirect_inheritance._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void capitalizedType() {
        assertEquals("Engineer", new Employee("wonpyol", "engineer").capitalizedType());
        assertEquals("Engineer", new FullTimeEmployee("wonpyol", "engineer").capitalizedType());
    }

    @Test
    void polymorphismTest() {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("wonpyol", "engineer");
        assertInstanceOf(Employee.class, fullTimeEmployee);
        assertInstanceOf(FullTimeEmployee.class, fullTimeEmployee);
    }
}