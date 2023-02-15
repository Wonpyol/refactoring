package com.study.refactoring._08_shotgun_surgery.inline_function._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatingTest {
    @Test
    void rating() {
        Driver driver = new Driver(10);
        Rating rating = new Rating();
        assertEquals(2, rating.rating(driver));
    }

}