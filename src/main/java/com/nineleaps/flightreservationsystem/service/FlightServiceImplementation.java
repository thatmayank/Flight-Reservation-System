package com.nineleaps.flightreservationsystem.service;

import com.nineleaps.flightreservationsystem.entity.Flight;
import com.nineleaps.flightreservationsystem.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImplementation implements IFlightService {
    @Autowired
    private FlightRepository flightRepository;

    @Override
    public Flight addFlight(Flight newFlight) {
        return flightRepository.save(newFlight);
    }

    @Override
    public Flight updateFlight(Flight updateFlight, Long id) {
        Flight res = flightRepository.findById(id).get();
        if (res != null) {
            res.setDepartureLocation(updateFlight.getDepartureLocation());
            res.setArrivalLocation(updateFlight.getArrivalLocation());
            res.setDepartureTime(updateFlight.getDepartureTime());
            res.setArrivalTime(updateFlight.getArrivalTime());
        }
        flightRepository.save(res);
        return res;
    }

    @Override
    public Flight cancelFlight(Long id) {
        Flight res = flightRepository.findById(id).get();
        flightRepository.deleteById(id);
        return res;
    }

    @Override
    public List<Flight> viewAllFlights() {
        return flightRepository.findAll();
    }
}
