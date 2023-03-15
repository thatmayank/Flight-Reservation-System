package com.nineleaps.flightreservationsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fare")
public class Fare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double economyFare;
    private double premiumFare;
    private double businessFare;

    public Fare() {
    }

    public Fare(Long id, double economyFare, double premiumFare, double businessFare) {
        this.id = id;
        this.economyFare = economyFare;
        this.premiumFare = premiumFare;
        this.businessFare = businessFare;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getEconomyFare() {
        return economyFare;
    }

    public void setEconomyFare(double economyFare) {
        this.economyFare = economyFare;
    }

    public double getPremiumFare() {
        return premiumFare;
    }

    public void setPremiumFare(double premiumFare) {
        this.premiumFare = premiumFare;
    }

    public double getBusinessFare() {
        return businessFare;
    }

    public void setBusinessFare(double businessFare) {
        this.businessFare = businessFare;
    }

    @Override
    public String toString() {
        return "Fare{" +
                "id=" + id +
                ", economyFare=" + economyFare +
                ", premiumFare=" + premiumFare +
                ", businessFare=" + businessFare +
                '}';
    }
}
