package com.room.room.interfaces.controller;

import com.room.room.domain.model.Room;
import com.room.room.application.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService service;

    public RoomController(RoomService service) {
        this.service = service;
    }

    @GetMapping
    public List<Room> list() {
        return service.list();
    }

    @PostMapping
    public Room create(@RequestBody Room room) {
        return service.save(room);
    }
}
