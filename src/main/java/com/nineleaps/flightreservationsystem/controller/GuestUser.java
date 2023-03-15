package com.nineleaps.flightreservationsystem.controller;

import com.nineleaps.flightreservationsystem.entity.Booking;
import com.nineleaps.flightreservationsystem.entity.Flight;
import com.nineleaps.flightreservationsystem.entity.User;
import com.nineleaps.flightreservationsystem.service.BookingServiceImplementation;
import com.nineleaps.flightreservationsystem.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guestuser")
public class GuestUser {

    @Autowired
    private BookingServiceImplementation bookingService;
    @Autowired
    private UserServiceImplementation userService;

    @PostMapping("/adduserdetails") //Registeration
    public User addUserDetails(@RequestBody User newUser) {
        return userService.addUserDetails(newUser);
    }

    @GetMapping("/searchflights/{source}/{destination}") //search flights
    public List<Flight> searchFlights(@PathVariable("source") String source, @PathVariable("destination") String destination) {
        return userService.searchFlights(source, destination);
    }

    @PostMapping("/bookflight") //function to book flights
    public Booking bookFlight(@RequestBody Booking newBooking) {
        return bookingService.bookFlight(newBooking);
    }
}
