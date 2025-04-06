package com.reserve.reserve.infrastructure.repository;

import com.reserve.reserve.domain.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {}
