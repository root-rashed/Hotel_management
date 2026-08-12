package com.example.hotel.controller;

import com.example.hotel.models.Booking;
import com.example.hotel.services.BookingService;
import com.example.hotel.services.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;
    private final GuestService guestService;

    public BookingController(BookingService bookingService, GuestService guestService) {
        this.bookingService = bookingService;
        this.guestService = guestService;
    }



    @GetMapping("/add")
    public String booking(Model model) {
        model.addAttribute("booking", new Booking());
        model.addAttribute("guests", guestService.findAll());
        return "booking_form";
    }





    @PostMapping("/add")
    public String addBooking(@ModelAttribute Booking booking) {

        if (booking.getGuest() != null && booking.getGuest().getGuestId() != null) {
            guestService.findById(booking.getGuest().getGuestId()).ifPresent(booking::setGuest);
        }

        bookingService.save(booking);
        return "redirect:/booking/add";
    }

}