package com.study.refactoring._16_temporary_field.introduce_special_case._02_after;

public class Site {

    private Customer customer;

    public Site(Customer customer) {
        this.customer = "unknown".equals(customer.getName()) ? new UnknownCustomer() : customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
