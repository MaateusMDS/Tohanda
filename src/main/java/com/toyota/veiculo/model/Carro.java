package com.toyota.veiculo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_CARRO")
public class Carro extends Veiculo{

    @Column(name = "NUM_LUGARES")
    private int lugares;

    public Carro(Long id, String modelo, String fabricante, String cor, LocalDate dataFabricacao, int lugares) {
        super(id, modelo, fabricante, cor, dataFabricacao);
        this.lugares = lugares;
    }
}
