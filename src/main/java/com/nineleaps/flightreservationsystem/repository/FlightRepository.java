package com.nineleaps.flightreservationsystem.repository;

import com.nineleaps.flightreservationsystem.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByDepartureLocationAndArrivalLocation(String source, String destination);
}
