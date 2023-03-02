package com.study.refactoring._18_middle_man.replace_subclass_with_delegate._02_after;


public class PremiumDelegate {
    private Booking host;
    private PremiumExtra extra;

    public PremiumDelegate(Booking host, PremiumExtra extra) {
        this.host = host;
        this.extra = extra;
    }

    public boolean hasTalkback() {
        return this.host.show.hasOwnProperty("talkback");
    }

    public double extraBasePrice(double price) {
        return Math.round(price + this.extra.getPremiumFee());
    }

    public Booking getHost() {
        return host;
    }

    public void setHost(Booking host) {
        this.host = host;
    }

    public PremiumExtra getExtra() {
        return extra;
    }

    public void setExtra(PremiumExtra extra) {
        this.extra = extra;
    }
}
