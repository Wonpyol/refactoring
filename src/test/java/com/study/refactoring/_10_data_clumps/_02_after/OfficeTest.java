package com.study.refactoring._10_data_clumps._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {
    @Test
    void officePhoneNumber() {
        TelephoneNumber telephoneNumber = new TelephoneNumber("010", "7777-7777");
        Office office = new Office(telephoneNumber, "Ansan");

        assertEquals("010-7777-7777", office.officePhoneNumber());
    }

}