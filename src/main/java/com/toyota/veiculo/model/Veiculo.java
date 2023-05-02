package com.toyota.veiculo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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

    @Column(name = "DS_MODELO")
    private String modelo;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(
            name = ("NM_FABRICANTE"),
            referencedColumnName = ("ID_FABRICANTE"),
            foreignKey = @ForeignKey(
                    name = "FK_ID_FABRICANTE"
            )
    )
    private Fabricante fabricante;

    @Column(name = "DS_COR")
    private String cor;

    @Column(name = "DT_FABRICACAO")
    private LocalDate dataFabricacao;
}
