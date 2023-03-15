package com.nineleaps.flightreservationsystem.service;

import com.nineleaps.flightreservationsystem.entity.Booking;
import com.nineleaps.flightreservationsystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImplementation implements IBookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking bookFlight(Booking newBooking) {
        return bookingRepository.save(newBooking);
    }

    @Override
    public List<Booking> viewAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking cancelBooking(Long id) {
        Booking res = bookingRepository.findById(id).get();
        bookingRepository.deleteById(id);
        return res;
    }

    @Override
    public Booking modifyBooking(Booking modifyBooking, Long id) {
        Booking res = bookingRepository.findById(id).get();
        if(res != null) {
            res.setBookingNumber(modifyBooking.getBookingNumber());
            res.setBookingDate(modifyBooking.getBookingDate());
            res.setTravelDate(modifyBooking.getTravelDate());
            res.setTotalCost(modifyBooking.getTotalCost());
        }
        bookingRepository.save(res);
        return res;
    }
}
