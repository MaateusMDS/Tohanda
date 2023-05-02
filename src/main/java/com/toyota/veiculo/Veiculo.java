package com.toyota.veiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@NoArgsConstructor
public abstract  class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_VEICULOS")
    @SequenceGenerator(name = "SQ_VEICULOS", sequenceName = "SQ_VEICULOS")
    @Column(name = "ID_VEICULO")
    private Long id;

    private String modelo;

    private String fabricante;

    private String cor;

    private Date dataFabricacao;
}
