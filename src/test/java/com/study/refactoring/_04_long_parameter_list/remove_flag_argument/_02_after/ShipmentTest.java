package com.study.refactoring._04_long_parameter_list.remove_flag_argument._02_after;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShipmentTest {
    @Test
    void deliveryDate() {
        LocalDate placedOn = LocalDate.of(2021, 12, 15);
        Order orderFromWA = new Order(placedOn, "WA");

        Shipment shipment = new Shipment();
        assertEquals(placedOn.plusDays(1), shipment.fastDeliveryDate(orderFromWA));
        assertEquals(placedOn.plusDays(2), shipment.normalDeliveryDate(orderFromWA));
    }

}