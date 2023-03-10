package com.study.refactoring._06_mutable_data.combine_functions_into_transform._01_before;

import java.time.Month;
import java.time.Year;

public class Client3 extends ReadingClient {

    private double basicChargeAmount;

    public Client3(Reading reading) {
        this.basicChargeAmount = calculateBaseCharge(reading);
    }

    private double calculateBaseCharge(Reading reading) {
        return baseRate(reading.month(), reading.year()) * reading.quantity();
    }

    public double getBasicChargeAmount() {
        return basicChargeAmount;
    }
}
