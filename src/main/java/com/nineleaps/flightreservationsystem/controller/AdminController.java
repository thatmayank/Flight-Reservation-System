package com.nineleaps.flightreservationsystem.controller;

import com.nineleaps.flightreservationsystem.entity.Flight;
import com.nineleaps.flightreservationsystem.entity.User;
import com.nineleaps.flightreservationsystem.service.FlightServiceImplementation;
import com.nineleaps.flightreservationsystem.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private FlightServiceImplementation flightService;
    @Autowired
    private UserServiceImplementation userService;

    @PostMapping("/addflight") //add flight details //schedule flights
    public Flight addFlight(@RequestBody Flight newFlight) {
        return flightService.addFlight(newFlight);
    }

    @PutMapping("/updateflight/{id}") // modify schedule of flights //modify route
    public Flight updateFlight(@RequestBody Flight updateFlight, @PathVariable("id") Long id) {
        return flightService.updateFlight(updateFlight, id);
    }

    @GetMapping("/cancelflight/{id}") //cancel flight
    public Flight cancelFlight(@PathVariable("id") Long id) {
        return flightService.cancelFlight(id);
    }


    @GetMapping("/viewallflights") //view all flights
    public List<Flight> viewAllFlights() {
        return flightService.viewAllFlights();
    }

    @GetMapping("/viewallusers") //view all users
    public List<User> viewAllUsers() {
        return userService.viewAllUsers();
    }

}
