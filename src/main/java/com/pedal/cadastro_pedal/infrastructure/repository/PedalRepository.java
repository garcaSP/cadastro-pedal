package com.pedal.cadastro_pedal.infrastructure.repository;

import com.pedal.cadastro_pedal.infrastructure.entity.Pedal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedalRepository extends JpaRepository<Pedal,Integer> {
}
