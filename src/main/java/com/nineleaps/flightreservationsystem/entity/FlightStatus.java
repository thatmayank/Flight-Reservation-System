package com.nineleaps.flightreservationsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "flightstatus")
public class FlightStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int remainingEconomySeats;
    private int remainingPremiumSeats;
    private int remainingBusinessSeats;

    public FlightStatus() {
    }

    public FlightStatus(Long id, int remainingEconomySeats, int remainingPremiumSeats, int remainingBusinessSeats) {
        this.id = id;
        this.remainingEconomySeats = remainingEconomySeats;
        this.remainingPremiumSeats = remainingPremiumSeats;
        this.remainingBusinessSeats = remainingBusinessSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRemainingEconomySeats() {
        return remainingEconomySeats;
    }

    public void setRemainingEconomySeats(int remainingEconomySeats) {
        this.remainingEconomySeats = remainingEconomySeats;
    }

    public int getRemainingPremiumSeats() {
        return remainingPremiumSeats;
    }

    public void setRemainingPremiumSeats(int remainingPremiumSeats) {
        this.remainingPremiumSeats = remainingPremiumSeats;
    }

    public int getRemainingBusinessSeats() {
        return remainingBusinessSeats;
    }

    public void setRemainingBusinessSeats(int remainingBusinessSeats) {
        this.remainingBusinessSeats = remainingBusinessSeats;
    }

    @Override
    public String toString() {
        return "FlightStatus{" +
                "id=" + id +
                ", remainingEconomySeats=" + remainingEconomySeats +
                ", remainingPremiumSeats=" + remainingPremiumSeats +
                ", remainingBusinessSeats=" + remainingBusinessSeats +
                '}';
    }
}
