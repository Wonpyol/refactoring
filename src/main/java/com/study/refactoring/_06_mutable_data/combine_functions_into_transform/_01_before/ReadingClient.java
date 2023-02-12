package com.study.refactoring._06_mutable_data.combine_functions_into_transform._01_before;

import com.study.refactoring._06_mutable_data.combine_functions_into_transform._02_after.EnrichReading;

import java.time.Month;
import java.time.Year;

public class ReadingClient {

    protected double taxThreshold(Year year) {
        return 5;
    }

    protected double baseRate(Month month, Year year) {
        return 10;
    }

}
