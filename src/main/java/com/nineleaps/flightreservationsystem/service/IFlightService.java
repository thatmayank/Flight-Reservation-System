package com.nineleaps.flightreservationsystem.service;

import com.nineleaps.flightreservationsystem.entity.Flight;

import java.util.List;

public interface IFlightService {

    public Flight addFlight(Flight newFlight);

    public Flight updateFlight(Flight updateFlight, Long id);

    public Flight cancelFlight(Long id);

    public List<Flight> viewAllFlights();

}
