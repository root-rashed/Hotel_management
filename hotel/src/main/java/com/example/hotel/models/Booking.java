package com.example.hotel.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int floor;
    private int room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;


    private int daysStays;
    private double price;
    private String paymentStatus;


    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest = new Guest();
}