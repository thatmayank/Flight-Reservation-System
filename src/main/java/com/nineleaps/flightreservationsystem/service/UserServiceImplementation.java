package com.nineleaps.flightreservationsystem.service;

import com.nineleaps.flightreservationsystem.entity.Flight;
import com.nineleaps.flightreservationsystem.entity.FlightStatus;
import com.nineleaps.flightreservationsystem.entity.User;
import com.nineleaps.flightreservationsystem.repository.FlightRepository;
import com.nineleaps.flightreservationsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FlightRepository flightRepository;


    @Override
    public User addUserDetails(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public User updateUserDetails(User updateUser, Long id) {
        User res = userRepository.findById(id).get();
        if (res != null) {
            res.setUserName(updateUser.getUserName());
            res.setPassword(updateUser.getPassword());
            res.setEmail(updateUser.getEmail());
            res.setFirstName(updateUser.getFirstName());
            res.setLastName(updateUser.getLastName());
        }
        userRepository.save(res);
        return res;
    }

    @Override
    public List<Flight> searchFlights(String source, String destination) {
        return flightRepository.findByDepartureLocationAndArrivalLocation(source, destination);
    }

    @Override
    public FlightStatus checkAvailability(Long id) {
        return null;
    }

    @Override
    public void bookFlight(Long id) {

    }

    @Override
    public List<User> viewAllUsers() {
        return userRepository.findAll();
    }
}
