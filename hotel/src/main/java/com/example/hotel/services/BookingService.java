package com.example.hotel.services;

import com.example.hotel.models.Booking;
import com.example.hotel.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    // To save booking
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }



    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }
    public Optional<Booking> findById(Long id) {
        return bookingRepository.findById(id);
    }



}