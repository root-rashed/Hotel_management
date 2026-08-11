package com.example.hotel.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String Home() {
        return "index";
    }

    @GetMapping("/error")
    public String Error() {
        return "error";
    }

    public record UserDto(String name, String email,String phone, String password) {}





}
