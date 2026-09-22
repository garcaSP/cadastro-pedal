package com.pedal.cadastro_pedal.business;

import com.pedal.cadastro_pedal.infrastructure.repository.PedalRepository;
import org.springframework.stereotype.Service;

@Service
public class PedalService {

    private final PedalRepository repository;

    public PedalService(PedalRepository repository) {
        this.repository = repository;
    }

    public void salvarPedal(Pedal pedal)
    {
        repository.saveAndFlush(pedal);
    }

}
