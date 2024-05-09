package com.frases.frasesseries.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.frases.frasesseries.dto.FraseDTO;
import com.frases.frasesseries.model.Frase;
import com.frases.frasesseries.repository.FraseRepository;

@Service
public class ServiceRepository {

    @Autowired
    FraseRepository repositorio;

    public List<FraseDTO> obtenerMisFrases() {
        List<Frase> frases = repositorio.findAll();
        return frases.stream()
                .map(f -> new FraseDTO(f.getId(), f.getTitulo(), f.getPoster(), f.getFrase(), f.getPersonaje()))
                .collect(Collectors.toList());
    }

    public FraseDTO obtenerMiFrase(Long id) {
        Optional<Frase> frase = repositorio.findById(id);
        if (frase.isPresent()) {
            Frase miFrase = frase.get();
            return new FraseDTO(miFrase.getId(), miFrase.getTitulo(), miFrase.getPoster(), miFrase.getFrase(),
                    miFrase.getPersonaje());
        }
        return null;
    }

    public FraseDTO obtenerMiFrasesita() {
        Frase miFrase = repositorio.obtenerFraseRandom();
        return new FraseDTO(miFrase.getId(), miFrase.getTitulo(), miFrase.getPoster(), miFrase.getFrase(),
                miFrase.getPersonaje());
    }

}
