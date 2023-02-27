package com.study.refactoring._16_temporary_field.introduce_special_case._01_before;

public class Site {

    private Customer customer;

    public Site(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
