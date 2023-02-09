package com.study.refactoring._06_mutable_data.separate_query_from_modifier._02_after;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {

    @Test
    void getTotalOutstanding() {
        Customer customer = new Customer("wonpyol", Arrays.asList(new Invoice(100d)));
        EmailGateway emailGateway = new EmailGateway();
        Billing billing = new Billing(customer, emailGateway);
        assertEquals(100d, billing.getTotalOutstanding());

        billing.sendBill();
    }

    @Test
    void sendBill() {
        Customer customer = new Customer("wonpyol", Arrays.asList(new Invoice(100d)));
        EmailGateway emailGateway = new EmailGateway();
        Billing billing = new Billing(customer, emailGateway);
        billing.sendBill();
    }


}