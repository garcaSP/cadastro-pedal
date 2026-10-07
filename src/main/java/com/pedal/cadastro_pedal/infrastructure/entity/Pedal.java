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

    @Column (name = "nome", length = 48)
    private String nome;

    @Column (name = "ano")
    private Integer ano;

    @Column (name = "efeito")
    private String efeito;

    @Column (name = "marca")
    private String marca;

}
