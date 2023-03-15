package com.nineleaps.flightreservationsystem.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long bookingNumber;
    private Date bookingDate;
    private Date travelDate;
    private double totalCost;

    public Booking() {
    }

    public Booking(Long id, long bookingNumber, Date bookingDate, Date travelDate, double totaCost) {
        this.id = id;
        this.bookingNumber = bookingNumber;
        this.bookingDate = bookingDate;
        this.travelDate = travelDate;
        this.totalCost = totalCost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(long bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", bookingNumber=" + bookingNumber +
                ", bookingDate=" + bookingDate +
                ", travelDate=" + travelDate +
                ", totalCost=" + totalCost +
                '}';
    }
}
