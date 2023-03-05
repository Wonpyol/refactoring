package com.study.refactoring._20_large_class.extract_superclass._02_after;

public class Employee extends Party {

    private Integer id;

    private double monthlyCost;

    public Employee(String name, Integer id, double monthlyCost) {
        super(name);
        this.id = id;
        this.monthlyCost = monthlyCost;
    }

    @Override
    protected double monthlyCost() {
        return monthlyCost;
    }

    @Override
    protected double annualCost() {
        return this.monthlyCost * 12;
    }

    public Integer getId() {
        return id;
    }



//    public double getMonthlyCost() {
//        return monthlyCost;
//    }
//    public double annualCost() {
//        return this.monthlyCost * 12;
//    }
}
