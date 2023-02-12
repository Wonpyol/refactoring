package com.study.refactoring._06_mutable_data.replace_derived_variable_with_query._02_after;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private double production; //deriverd variable
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
    }

    public double getProduction() {
        return this.adjustments.stream().mapToDouble(Double::doubleValue).sum();
    }
}
