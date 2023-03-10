package com.study.refactoring._06_mutable_data.combine_functions_into_transform._01_before;

import java.time.Month;
import java.time.Year;

public class Client1 extends ReadingClient{

    double baseCharge;

    public Client1(Reading reading) {
        this.baseCharge = baseRate(reading.month(), reading.year()) * reading.quantity();
    }
    public double getBaseCharge() {
        return baseCharge;
    }
}
