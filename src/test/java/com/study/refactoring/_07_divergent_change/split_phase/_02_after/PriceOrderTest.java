package com.study.refactoring._07_divergent_change.split_phase._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceOrderTest {

    @Test
    void priceOrder() {
        PriceOrder priceOrder = new PriceOrder();
        Product product = new Product(100, 10, 10);
        ShippingMethod shippingMethod = new ShippingMethod(100, 10, 10);
        assertEquals(110, priceOrder.priceOrder(product, 1, shippingMethod));
    }

}