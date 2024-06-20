package com.iacono.app.Hotel.Reservation.Management.System.repository;

import com.iacono.app.Hotel.Reservation.Management.System.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByUserId(Long userId);

    List<Reservation> findByRoomId(Long roomId);

}
