package com.reserve.reserve.application.service;

import com.reserve.reserve.domain.model.Reserve;
import com.reserve.reserve.infrastructure.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReserveService {
    @Autowired
    private ReserveRepository repository;

    public Reserve save(Reserve reserve) {
        return repository.save(reserve);
    }

    public List<Reserve> list() {
        return repository.findAll();
    }
}
