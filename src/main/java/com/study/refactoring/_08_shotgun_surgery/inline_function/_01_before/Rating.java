package com.study.refactoring._08_shotgun_surgery.inline_function._01_before;

public class Rating {

    public int rating(Driver driver) {
        return moreThanFiveLateDeliveries(driver) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5;
    }
}
