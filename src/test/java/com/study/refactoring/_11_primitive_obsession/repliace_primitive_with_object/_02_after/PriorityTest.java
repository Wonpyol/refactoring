package com.study.refactoring._11_primitive_obsession.repliace_primitive_with_object._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityTest {
    @Test
    void priority_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Priority("good").toString());
    }
    @Test
    void priority_success() {
        Priority priority = new Priority("normal");
        assertEquals("normal", priority.toString());
    }

    @Test
    void higherThan_true() {
        Priority priority = new Priority("high");
        Priority other = new Priority("low");

        assertTrue(priority.higherThan(other));

    }

    @Test
    void higherThan_false() {
        Priority priority = new Priority("high");
        Priority other = new Priority("rush");

        assertFalse(priority.higherThan(other));

    }

}