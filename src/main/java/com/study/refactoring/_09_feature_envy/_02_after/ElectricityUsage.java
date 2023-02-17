package com.study.refactoring._09_feature_envy._02_after;

public class ElectricityUsage {

    private double amount;

    private double pricePerUnit;

    public ElectricityUsage(double amount, double pricePerUnit) {
        this.amount = amount;
        this.pricePerUnit = pricePerUnit;
    }
    public double getElecticityBill() {
        return this.getAmount() * this.getPricePerUnit();
    }
    public double getAmount() {
        return amount;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
