package com.study.refactoring._09_feature_envy._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {
    @Test
    void calculateBill() {
        ElectricityUsage electricityUsage = new ElectricityUsage(10d, 10d);
        GasUsage gasUsage = new GasUsage(10d, 10d);
        Bill bill = new Bill(electricityUsage, gasUsage);

        assertEquals(200d, bill.calculateBill());
    }

}