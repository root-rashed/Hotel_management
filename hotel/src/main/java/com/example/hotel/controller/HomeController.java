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















    //    public final PasswordEncoder passwordEncoder;
//
//    public HomeController(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }

//    @GetMapping("/home")
//    public String Home() {
//        return "index";
//    }
//
//    @GetMapping("/error")
//    public String Error() {
//        return "error";
//    }


//    @GetMapping("/log")
//    public String Log() {
//        return "log";
//    }
//
//
//    @PostMapping("/log")
//    public String log() {
//        return "log";
//    }


//    @GetMapping("/register")
//    public String Register() {
//        return "register";
//    }


//    @GetMapping("/dashboard")
//    public String Dashboard() {
//        return "dashboard";
//    }
//
//
//    @PostMapping("/dashboard")
//    public String dashboard() {
//        return "dashboard";
//    }







//    @PostMapping("/register")
//    public String register(@ModelAttribute UserDto user) {
//
//        String encryptedPassword = passwordEncoder.encode(user.password);
//
//        System.out.println(user.password);
//        System.out.println(encryptedPassword);
//
//
//
//        userMap.put(user.email, encryptedPassword);
//
//
//        // Matches True/False
//        System.out.println(passwordEncoder.matches(user.password, encryptedPassword));
//
//        return "register";
//    }

//    public record UserDto(String name, String email,String phone, String password) {}
}
