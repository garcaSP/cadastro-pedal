package com.pedal.cadastro_pedal.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pedal")
@Entity

public class Pedal {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "Nome", length = 48)
    private String nome;

    @Column (name = "Ano")
    private Integer ano;

    @Column (name = "Efeito")
    private String efeito;

    @Column (name = "Marca")
    private String marca;

}
