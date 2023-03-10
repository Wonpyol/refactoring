package com.study.refactoring._06_mutable_data.combine_functions_into_transform._01_before;

import java.time.Month;
import java.time.Year;

public class Client2 extends ReadingClient{

    private double base;
    private double taxableCharge;

    public Client2(Reading reading) {
        this.base = baseRate(reading.month(), reading.year()) * reading.quantity();
        this.taxableCharge = Math.max(0, this.base - taxThreshold(reading.year()));
    }
    public double getBase() {
        return base;
    }

    public double getTaxableCharge() {
        return taxableCharge;
    }
}
