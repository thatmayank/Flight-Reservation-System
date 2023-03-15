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
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImplementation userService;
    @Autowired
    private BookingServiceImplementation bookingService;

    @PostMapping("/adduserdetails")
    public User addUserDetails(@RequestBody User newUser) {
        return userService.addUserDetails(newUser);
    }

    @PutMapping("/updateuserdetails/{id}")
    public User updateUserDetails(@RequestBody User updateUser, @PathVariable("id") long id) {
        return userService.updateUserDetails(updateUser, id);
    }

    @GetMapping("/searchflights/{source}/{destination}")
    public List<Flight> searchFlights(@PathVariable("source") String source, @PathVariable("destination") String destination) {
        return userService.searchFlights(source, destination);
    }

    //function to book flights
    @PostMapping("/bookflight")
    public Booking bookFlight(@RequestBody Booking newBooking) {
        return bookingService.bookFlight(newBooking);
    }

    //function to view all the bookings made
    @GetMapping("/viewallbooking")
    public List<Booking> viewAllBooking() {
        return bookingService.viewAllBooking();
    }

    //cancel booking
    @GetMapping("/cancelbooking/{id}")
    public Booking cancelBooking(@PathVariable("id") Long id) {
        return bookingService.cancelBooking(id);
    }

    //modify booking
    @PutMapping("/modifybooking/{id}")
    public Booking modifyBooking(@RequestBody Booking modifyBooking, @PathVariable("id") Long id) {
        return bookingService.modifyBooking(modifyBooking, id);
    }
}
