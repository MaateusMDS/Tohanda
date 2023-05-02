package com.toyota.veiculo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_MOTO")
public class Moto extends Veiculo {

    private int adesivos;

    public Moto(Long id, String modelo, String fabricante, String cor, LocalDate dataFabricacao, int adesivos) {
        super(id, modelo, fabricante, cor, dataFabricacao);
        this.adesivos = adesivos;
    }
}
