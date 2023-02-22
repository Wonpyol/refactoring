package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.direct_inheritance._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void getType() {
        assertEquals("manager", Employee.createEmployee("wonpyol", "manager").getType());
        assertEquals("salesman", Employee.createEmployee("wonpyol", "salesman").getType());
        assertEquals("engineer", Employee.createEmployee("wonpyol", "engineer").getType());
        assertThrows(IllegalArgumentException.class, () -> Employee.createEmployee("wonpyol", "tester").getType());
    }

    @Test
    void polymorphismTest() {
        Manager employee = (Manager) Employee.createEmployee("wonpyol", "manager");
        assertInstanceOf(Manager.class, employee);
        assertInstanceOf(Employee.class, employee);
    }



}