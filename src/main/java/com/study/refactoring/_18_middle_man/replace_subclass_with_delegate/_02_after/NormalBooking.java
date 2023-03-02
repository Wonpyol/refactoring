package com.study.refactoring._18_middle_man.replace_subclass_with_delegate._02_after;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class NormalBooking implements BookingDelegate {

    protected Show show;

    protected LocalDateTime time;

    public NormalBooking(Show show, LocalDateTime time) {
        this.show = show;
        this.time = time;
    }

    @Override
    public boolean hasTalkback() {
        return this.show.hasOwnProperty("talkback") && !this.isPeakDay();
    }

    @Override
    public boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    @Override
    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        return result;
    }

}
