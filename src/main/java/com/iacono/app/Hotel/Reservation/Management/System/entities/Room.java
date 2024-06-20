package com.iacono.app.Hotel.Reservation.Management.System.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    private String number;
    private String type;
    private double price;
    private boolean available;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservations;
}
