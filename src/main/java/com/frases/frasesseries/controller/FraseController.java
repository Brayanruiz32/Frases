package com.frases.frasesseries.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frases.frasesseries.dto.FraseDTO;
import com.frases.frasesseries.service.FraseService;


@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired
    private FraseService servicio;


    // @GetMapping("/frases")
    // public List<FraseDTO> obtenerFrases() {
    //     return servicio.obtenerMisFrases();
    // }
    
    @GetMapping("/frases")
    public FraseDTO obtenerFrasesita() {
        return servicio.obtenerMiFrasesita();
    }
    
    // @GetMapping("/frases/{id}")
    // public FraseDTO obtenerFrase(Long id) {
    //     return servicio.obtenerMiFrase(id);
    // }


}
