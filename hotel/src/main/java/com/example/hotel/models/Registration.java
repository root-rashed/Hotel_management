package com.example.hotel.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Registration {

    private long id;

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String phone;
    private String country;
    private String password;
    private String confirmPassword;



}
