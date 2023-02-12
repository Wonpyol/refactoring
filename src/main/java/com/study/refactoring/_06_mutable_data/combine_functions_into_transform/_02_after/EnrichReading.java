package com.study.refactoring._06_mutable_data.combine_functions_into_transform._02_after;


public record EnrichReading(Reading reading, double baseCharge, double taxableCharge)  {
}
