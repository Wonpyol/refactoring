package com.study.refactoring._09_feature_envy._02_after;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public Bill(ElectricityUsage electricityUsage, GasUsage gasUsage) {
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }

    public double calculateBill() {
        return electricityUsage.getElecticityBill() + gasUsage.getGasBill();
    }

}
