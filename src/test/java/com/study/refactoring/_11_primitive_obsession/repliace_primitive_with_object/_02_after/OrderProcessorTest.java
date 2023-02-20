package com.study.refactoring._11_primitive_obsession.repliace_primitive_with_object._02_after;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderProcessorTest {
    @Test
    void numberOfHighPriorityOrders() {
        List<Order> orders = List.of(
                new Order(new Priority("high")),
                new Order(new Priority("high")),
                new Order(new Priority("high")),
                new Order(new Priority("rush")),
                new Order(new Priority("normal"))
        );
        assertEquals(4, new OrderProcessor().numberOfHighPriorityOrders(orders));
    }

}