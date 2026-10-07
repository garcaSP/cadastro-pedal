package com.pedal.cadastro_pedal.business;

import com.pedal.cadastro_pedal.infrastructure.entity.Pedal;
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

    public Pedal buscarPedalPorNome(String nome){
        return repository.findByNome(nome).orElseThrow(
                () -> new RuntimeException("Pedal não encontrado")
        );
    }

    public void deletarPedalPorNome(String nome){
        repository.deleteByNome(nome);
    }

    public void atualizarPedalPorId(Integer id, Pedal pedal) {
        Pedal pedalEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Pedal não encontrado"));

        Pedal pedalAtualizado = Pedal.builder()
                .id(pedalEntity.getId())
                .build();

        repository.saveAndFlush(pedalAtualizado);
    }
}
