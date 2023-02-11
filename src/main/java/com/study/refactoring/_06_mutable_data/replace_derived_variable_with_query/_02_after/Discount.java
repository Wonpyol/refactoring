package com.study.refactoring._06_mutable_data.replace_derived_variable_with_query._02_after;

public class Discount {

    private double discountedTotal; //derived variable 제거됨!
    private double discount;
    private double baseTotal;

    public Discount(double baseTotal) {
        this.baseTotal = baseTotal;
    }

    public double getDiscountedTotal() {
        return this.baseTotal - this.discount;
    }

    public void setDiscount(double number) {
        this.discount = number;
    }
}
