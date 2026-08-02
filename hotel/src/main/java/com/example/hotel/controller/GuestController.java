package com.example.hotel.controller;

import com.example.hotel.models.Guest;
import com.example.hotel.services.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guest")
public class GuestController {

    private final GuestService guestService;



    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }




    @GetMapping("/add")
    public String addGuest(Model model) {
        model.addAttribute("guest", new Guest());
        return "guest_form";
    }



    @PostMapping("/add")
    public String saveGuest(@ModelAttribute Guest guest) {
        guestService.save(guest);
        return "redirect:/guest/add";
    }
}