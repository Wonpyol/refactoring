package com.study.refactoring._18_middle_man.replace_subclass_with_delegate._02_after;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class PremiumBooking implements BookingDelegate {

    private PremiumExtra extra;

    private Show show;

    private LocalDateTime time;

    public PremiumBooking(PremiumExtra extra, Show show, LocalDateTime time) {
        this.extra = extra;
        this.show = show;
        this.time = time;
    }

    @Override
    public boolean hasTalkback() {
        return this.show.hasOwnProperty("talkback");
    }

    @Override
    public boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    @Override
    public double basePrice() {
        double result = this.show.getPrice() + this.extra.getPremiumFee();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        return result;
    }

    public boolean hasDinner() {
        return this.extra.hasOwnProperty("dinner") && !this.isPeakDay();
    }
}
