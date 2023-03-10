package com.study.refactoring._06_mutable_data.split_variable._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void updateGeomety() {
        Rectangle rectangle = new Rectangle();
        rectangle.updateGeometry(10, 5);

        assertEquals(50d, rectangle.getArea());
        assertEquals(30d, rectangle.getPerimeter());

        rectangle.updateGeometry(5, 5);
        assertEquals(25d, rectangle.getArea());
        assertEquals(20d, rectangle.getPerimeter());
    }


}