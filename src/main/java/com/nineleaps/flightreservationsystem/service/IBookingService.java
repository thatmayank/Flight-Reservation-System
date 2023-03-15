package com.nineleaps.flightreservationsystem.service;


import com.nineleaps.flightreservationsystem.entity.Booking;

import java.util.List;

public interface IBookingService {

//function to book flights
    public Booking bookFlight(Booking newBooking);

    //function to view all the bookings made
    public List<Booking> viewAllBooking();

    //cancel booking
    public Booking cancelBooking(Long id);

    //modify booking
    public Booking modifyBooking(Booking modifyBooking, Long id);
}
