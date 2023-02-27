package com.study.refactoring._16_temporary_field.introduce_special_case._02_after;

public class UnknownCustomer extends Customer{
    public UnknownCustomer() {
        super("unknown", new BasicBillingPlan(), null);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
