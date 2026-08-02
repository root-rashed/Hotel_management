package com.example.hotel.services;

import com.example.hotel.models.Guest;
import com.example.hotel.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestService{

    private final GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }


    // To save guest
    public Guest save(Guest guest) {
        return guestRepository.save(guest);
    }





    // To find all
    public List<Guest> findAll() {
        return guestRepository.findAll();
    }

    // To find by id
    public Optional<Guest> findById(Long guestId) {
        return guestRepository.findById(guestId);
    }

}