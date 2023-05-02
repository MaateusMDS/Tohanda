package com.toyota.veiculo;

import com.toyota.veiculo.model.Carro;
import com.toyota.veiculo.model.Fabricante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maria-db");
        EntityManager entityManager = factory.createEntityManager();

        var fabricante = new Fabricante();
        fabricante.setNome("Honda");

        var carro = new Carro();
        carro.setCor("Azul");
        carro.setModelo("Civic");
        carro.setFabricante(fabricante);
        carro.setLugares(4);
        carro.setDataFabricacao(LocalDate.now());

        entityManager.getTransaction().begin();
        entityManager.persist(fabricante);
        entityManager.persist(carro);
        entityManager.getTransaction().commit();

    }
}