package com.study.refactoring._19_insider_trading._02_after;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CheckInTest {
    @Test
    void isFastPass() {
        CheckIn checkIn = new CheckIn();
        assertFalse(new Ticket(LocalDate.now(), true).isFastPass());
        assertFalse(new Ticket(LocalDate.now(), false).isFastPass());

        LocalDate earlyBirdDate = LocalDate.of(2021, 1, 1);
        assertTrue(new Ticket(earlyBirdDate, true).isFastPass());
        assertFalse(new Ticket(earlyBirdDate, false).isFastPass());

    }

}