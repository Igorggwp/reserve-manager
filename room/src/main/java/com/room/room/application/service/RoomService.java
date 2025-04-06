package com.room.room.application.service;

import com.room.room.domain.model.Room;
import com.room.room.infrastructure.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository repository;

    public List<Room> list() {
        return repository.findAll();
    }

    public Room save(Room room) {
        return repository.save(room);
    }
}
