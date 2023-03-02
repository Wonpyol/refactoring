package com.study.refactoring._18_middle_man.replace_subclass_with_delegate._02_after;

public interface BookingDelegate {
    boolean hasTalkback();

    boolean isPeakDay();

    public double basePrice();


}
