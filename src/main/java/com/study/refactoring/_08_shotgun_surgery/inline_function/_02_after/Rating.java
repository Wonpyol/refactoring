package com.study.refactoring._08_shotgun_surgery.inline_function._02_after;

public class Rating {

    public int rating(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5 ? 2 : 1;
    }

}
