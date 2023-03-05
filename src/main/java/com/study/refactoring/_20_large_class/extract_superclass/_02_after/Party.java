package com.study.refactoring._20_large_class.extract_superclass._02_after;

public abstract class Party {
    protected String name;

    public Party(String name) {
        this.name = name;
    }


    protected abstract double monthlyCost();

    protected abstract double annualCost();


    public String getName() {
        return name;
    }
}
