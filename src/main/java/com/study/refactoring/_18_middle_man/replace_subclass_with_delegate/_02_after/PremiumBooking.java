//package com.study.refactoring._18_middle_man.replace_subclass_with_delegate._02_after;
//
//import java.time.LocalDateTime;
//
//public class PremiumBooking {
//
//    private PremiumExtra extra;
//
//    public PremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
//        super(show, time);
//        this.extra = extra;
//    }
//
//    @Override
//    public boolean hasTalkback() {
//        return this.show.hasOwnProperty("talkback");
//    }
//
//    @Override
//    public double basePrice() {
//        return Math.round(super.basePrice() + this.extra.getPremiumFee());
//    }
//
//    public boolean hasDinner() {
//        return this.extra.hasOwnProperty("dinner") && !this.isPeakDay();
//    }
//}
