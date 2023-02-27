package com.study.refactoring._16_temporary_field.introduce_special_case._02_after;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    private CustomerService customerService;

    private Customer customer;

    private Customer unknownCutomer;

    @BeforeEach
    void init() {
        customerService = new CustomerService();
        customer =  new Customer("wonpyol", new BillingPlan(), new PaymentHistory(2023));
        unknownCutomer =  new Customer("unknown", new BasicBillingPlan(), null);
    }
    @Test
    void customerName() {
        Site site = new Site(customer);
        assertEquals("wonpyol", customerService.customerName(site));
    }
    @Test
    void customerNameUnknown() {
        Site site = new Site(unknownCutomer);
        assertEquals("occupant", customerService.customerName(site));

    }

    @Test
    void billingPlan() {
        Site site = new Site(customer);
        assertEquals(BillingPlan.class, customerService.billingPlan(site).getClass());
    }

    @Test
    void basicBillingPlan() {
        Site site = new Site(unknownCutomer);
        assertEquals(BasicBillingPlan.class, customerService.billingPlan(site).getClass());
    }

    @Test
    void weeksDelinquent() {
        Site site = new Site(customer);
        assertEquals(2023, customerService.weeksDelinquent(site));
    }

    @Test
    void weeksDelinquentUnknown() {
        Site site = new Site(unknownCutomer);
        assertEquals(0, customerService.weeksDelinquent(site));
    }

}