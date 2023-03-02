package com.study.refactoring._18_middle_man.replace_subclass_with_delegate._02_after;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @Test
    void basePrice() {
        Show show = new Show(List.of("talkback", "signback"), 2000D);
        Booking booking = new Booking(show, LocalDateTime.now().plusDays(3));

        assertEquals(2300D, booking.basePrice());
    }

    @Test
    void premiumBooking() {

        Show show = new Show(List.of("talkback", "signback"), 2000D);
        PremiumBooking premiumBooking = new PremiumBooking(show, LocalDateTime.now().plusDays(3), new PremiumExtra(List.of("dinner"), 1000D));

        assertEquals(3300D, premiumBooking.basePrice());

    }

}