package com.example.hotel.models;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Passport {
    private String passportNumber;
    private LocalDate expirationDate;
    private String country;
}
