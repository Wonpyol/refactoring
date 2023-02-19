package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.direct_inheritance._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void getType() {
        SalesMan salesMan = new SalesMan("wonypol");

        assertEquals("salesman", salesMan.getType());
    }

}