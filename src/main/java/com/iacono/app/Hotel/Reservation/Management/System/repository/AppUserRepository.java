package com.iacono.app.Hotel.Reservation.Management.System.repository;

import com.iacono.app.Hotel.Reservation.Management.System.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository <AppUser, Long> {
    AppUser findByUsername(String username);
    AppUser findByEmail(String email);
}
