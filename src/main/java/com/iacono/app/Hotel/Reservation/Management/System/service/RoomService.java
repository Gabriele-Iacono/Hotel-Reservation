package com.iacono.app.Hotel.Reservation.Management.System.service;

import com.iacono.app.Hotel.Reservation.Management.System.entities.Room;
import com.iacono.app.Hotel.Reservation.Management.System.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    public Room save(Room room) {
        return roomRepository.save(room);
    }

    public void deleteById(Long id) {
        roomRepository.deleteById(id);

    }
}
