package com.reserve.reserve.interfaces.controller;

import com.reserve.reserve.application.service.ReserveService;
import com.reserve.reserve.domain.model.Reserve;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserves")
public class ReserveController {
    private final ReserveService reserveService;

    public ReserveController(ReserveService reserveService) {
        this.reserveService = reserveService;
    }

    @GetMapping
    public List<Reserve> list() {
        return reserveService.list();
    }

    @PostMapping
    public ResponseEntity<Reserve> save(@RequestBody Reserve reserve) {
        Reserve savedReserve = reserveService.save(reserve);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedReserve);
    }
}
