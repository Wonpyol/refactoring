package com.study.refactoring._16_temporary_field.introduce_special_case._02_after;

public class CustomerService {

    public String customerName(Site site) {
        return site.getCustomer().getName();
    }

    public BillingPlan billingPlan(Site site) {
        Customer customer = site.getCustomer();
        return customer.getBillingPlan();
    }

    public int weeksDelinquent(Site site) {
        Customer customer = site.getCustomer();
        return customer.getPaymentHistory().getWeeksDelinquentInLastYear();
    }

}
