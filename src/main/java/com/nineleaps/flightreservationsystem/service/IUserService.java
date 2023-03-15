package com.nineleaps.flightreservationsystem.service;

import com.nineleaps.flightreservationsystem.entity.Flight;
import com.nineleaps.flightreservationsystem.entity.FlightStatus;
import com.nineleaps.flightreservationsystem.entity.User;

import java.util.List;

public interface IUserService {

    public User addUserDetails(User newUser);

    public User updateUserDetails(User updateUser, Long id);

    public List<Flight> searchFlights(String source, String destination);

    public FlightStatus checkAvailability(Long id);//flight id

    public void bookFlight(Long id);//flight id

    public List<User> viewAllUsers();


}
