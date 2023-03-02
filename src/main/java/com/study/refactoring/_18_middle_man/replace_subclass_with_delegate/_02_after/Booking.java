package com.study.refactoring._18_middle_man.replace_subclass_with_delegate._02_after;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Booking {

    protected BookingDelegate bookingDelegate;

    public Booking(BookingDelegate bookingDelegate) {
        this.bookingDelegate = bookingDelegate;
    }

    public boolean hasTalkback() {
        return this.bookingDelegate.hasTalkback();
    }

    protected boolean isPeakDay() {
        return this.bookingDelegate.isPeakDay();
    }

    public double basePrice() {
        return this.bookingDelegate.basePrice();
    }

}
