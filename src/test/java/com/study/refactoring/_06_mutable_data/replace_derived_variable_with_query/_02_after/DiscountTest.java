package com.study.refactoring._06_mutable_data.replace_derived_variable_with_query._02_after;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void getDiscountedTotal() {
        Discount discount = new Discount(1000d);
        discount.getDiscountedTotal();
        assertEquals(1000d, discount.getDiscountedTotal());

        discount.setDiscount(100d);
        assertEquals(900d, discount.getDiscountedTotal());
    }
}