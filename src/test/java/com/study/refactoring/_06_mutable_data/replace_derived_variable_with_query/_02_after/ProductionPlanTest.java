package com.study.refactoring._06_mutable_data.replace_derived_variable_with_query._02_after;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductionPlanTest {
    @Test
    void getProduction() {
        ProductionPlan productionPlan = new ProductionPlan();
        for (int i = 0; i <= 10; i++) {
            productionPlan.applyAdjustment(100);
        }
        Assertions.assertEquals(1000d, productionPlan.getProduction());
    }

}