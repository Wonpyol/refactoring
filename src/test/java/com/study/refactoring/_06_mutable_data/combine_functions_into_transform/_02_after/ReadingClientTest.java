package com.study.refactoring._06_mutable_data.combine_functions_into_transform._02_after;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReadingClientTest {
    @Test
    void client1() {
        Client1 client1 = new Client1(new Reading("WonpyoL", 10d, Month.AUGUST, Year.now()));
        assertEquals(100, client1.getBaseCharge());
    }
    @Test
    void client2() {
        Client2 client2 = new Client2(new Reading("WonpyoL", 10d, Month.AUGUST, Year.now()));
        assertEquals(100, client2.getBase());
        assertEquals(95, client2.getTaxableCharge());
    }
    @Test
    void client3() {
        Client3 client3 = new Client3(new Reading("WonpyoL", 10d, Month.AUGUST, Year.now()));
        assertEquals(100, client3.getBasicChargeAmount());
    }

}