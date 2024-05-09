package com.frases.frasesseries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.frases.frasesseries.repository.FraseRepository;

@SpringBootApplication
public class FrasesseriesApplication  {


	// @Autowired
    // FraseRepository repositorio;
	public static void main(String[] args) {
		SpringApplication.run(FrasesseriesApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	Principal principal = new Principal(repositorio);
	// 	principal.miPrincipal();
		
	// }
}
