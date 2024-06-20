package com.iacono.app.Hotel.Reservation.Management.System.repository;

import com.iacono.app.Hotel.Reservation.Management.System.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository <Room, Long> {
}
