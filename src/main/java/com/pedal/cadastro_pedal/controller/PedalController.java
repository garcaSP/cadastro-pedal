package com.pedal.cadastro_pedal.controller;

import com.pedal.cadastro_pedal.infrastructure.entity.Pedal;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pedal.cadastro_pedal.business.PedalService;

@RestController
@RequestMapping("/pedal")
@RequiredArgsConstructor


public class PedalController {

    private final PedalService pedalService;

    @PostMapping
    public ResponseEntity<Void> salvarPedal(@RequestBody Pedal pedal)
    {
        pedalService.salvarPedal(pedal);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Pedal> buscarPedalPorNome(@RequestParam String nome)
    {
        return ResponseEntity.ok(pedalService.buscarPedalPorNome(nome));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedal> buscarPedalPorId(@PathVariable Integer id)
    {
        return ResponseEntity.ok(pedalService.buscarPedalPorId(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarPedalPorNome(@RequestParam String nome)
    {
        pedalService.deletarPedalPorNome(nome);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> atualizarPedalPorId(@PathVariable Integer id, @RequestBody Pedal pedal)
    {
        pedalService.atualizarPedalPorId(id, pedal);
        return ResponseEntity.ok().build();
    }
}
