package com.study.refactoring._06_mutable_data.split_variable._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HaggisTest {

    @Test
    void distanceTravelled() {
        Haggis haggis = new Haggis(10d, 20d, 10, 5);
        assertEquals(50d, haggis.distanceTravelled(10));
        assertEquals(125d, haggis.distanceTravelled(20));
    }
}