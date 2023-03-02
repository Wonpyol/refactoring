package com.study.refactoring._18_middle_man.replace_subclass_with_delegate._02_after;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Booking {
    protected Show show;

    protected LocalDateTime time;

    private PremiumDelegate premiumDelegate;

    public Booking(Show show, LocalDateTime time) {
        this.show = show;
        this.time = time;
    }

    public static Booking createBooking(Show show, LocalDateTime time) {
        return new Booking(show, time);
    }

    public static Booking createPremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
        Booking booking = createBooking(show, time);
        booking.premiumDelegate = new PremiumDelegate(booking, extra);
        return booking;
    }

    public boolean hasTalkback() {
        return (premiumDelegate != null) ? premiumDelegate.hasTalkback() : (this.show.hasOwnProperty("talkback") && !this.isPeakDay());
    }

    protected boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        if(premiumDelegate != null) {
            result = premiumDelegate.extraBasePrice(result);
        }
        return result;
    }

    public boolean hasDinner() {
        return premiumDelegate != null && this.premiumDelegate.getExtra().hasOwnProperty("dinner") && !this.isPeakDay();
    }
}
