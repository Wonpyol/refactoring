package com.study.refactoring._06_mutable_data.split_variable._02_after;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {
    @Test
    void discount() {
        Order order = new Order();
        Assertions.assertEquals(10d, order.discount(10d, 10));
        Assertions.assertEquals(51d -2, order.discount(51d, 10));
        Assertions.assertEquals(10d -1, order.discount(10d, 101)
        );
    }
}
