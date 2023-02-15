package com.study.refactoring._08_shotgun_surgery.inline_class._02_after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipmentTest {
    @Test
    void getTrackingInfo() {
        String company = "Wonpyol";
        String number = "010-7777-7777";
        Shipment shipment = new Shipment(company, number);

        assertEquals(company+": "+number, shipment.getTrackingInfo());

    }

}