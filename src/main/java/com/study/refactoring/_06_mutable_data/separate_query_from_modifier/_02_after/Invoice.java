package com.study.refactoring._06_mutable_data.separate_query_from_modifier._02_after;

public class Invoice {

    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
