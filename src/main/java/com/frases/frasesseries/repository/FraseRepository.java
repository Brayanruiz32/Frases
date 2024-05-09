package com.frases.frasesseries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.frases.frasesseries.model.Frase;
import java.util.List;


public interface FraseRepository extends JpaRepository<Frase, Long> {
    Frase findByPersonaje(String personaje);

    @Query("Select f FROM Frase f ORDER BY RAND() LIMIT 1")
    Frase obtenerFraseRandom();


}
