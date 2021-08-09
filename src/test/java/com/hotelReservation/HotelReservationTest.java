package com.hotelReservation;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.*;

/**
 * this test case will check that hotel is added or not.
 */
class HotelreservationTest {
    @Test
    public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {
        HotelReservation hotelReservation = new HotelReservation();
        Hotel hotel = new Hotel("Lakewood",110);
        hotelReservation.addHotel(hotel);
        List hotelList = hotelReservation.getHotels();
        Assertions.assertTrue(hotelList.contains(hotel));
    }
}
