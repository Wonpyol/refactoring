package com.study.refactoring._24_comments.introduce_assertion._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void setDiscountRate() {
        Customer customer = new Customer();
        customer.setDiscountRate(-10d);

    }

}