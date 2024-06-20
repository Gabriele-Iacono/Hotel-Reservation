package com.iacono.app.Hotel.Reservation.Management.System.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//
    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser user;
//


//
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
//
}
