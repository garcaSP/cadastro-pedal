package com.pedal.cadastro_pedal.infrastructure.repository;

import com.pedal.cadastro_pedal.infrastructure.entity.Pedal;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PedalRepository extends JpaRepository<Pedal,Integer> {

    Optional<Pedal> findByNome(String nome);

    @Transactional
    void deleteByNome(String nome);

}