package com.frases.frasesseries;

import java.util.List;
import java.util.Scanner;


import com.frases.frasesseries.model.Frase;
import com.frases.frasesseries.repository.FraseRepository;

public class Principal {

    Scanner teclado = new Scanner(System.in);
    FraseRepository repositorio;
    
    public Principal(FraseRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void miPrincipal() {

        String menu = """
                1 - Registrar una nueva frase
                2 - Mostrar todas las frases
                3 - Salir
                """;
        System.out.println(menu);
        int opcion = Integer.parseInt(teclado.nextLine());
        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    agregarNuevaFrase();
                    break;
                case 2:
                    listarFrases();
                    break;
                default:
                    break;
            }
            System.out.println(menu);
            opcion = Integer.parseInt(teclado.nextLine());
        }
        System.out.println("Saliendoooo");
    }

    private void agregarNuevaFrase() {
        
        System.out.println("Ingresa la frase");
        String frase = teclado.nextLine();
        System.out.println("Ingresa el personaje");
        String personaje = teclado.nextLine();
        System.out.println("Ingresa el poster");
        var poster = teclado.nextLine();
        System.out.println("Ingresa el titulo");
        var titulo = teclado.nextLine();
        Frase miFrase = new Frase(titulo, poster, frase, personaje);
        try {
            repositorio.save(miFrase);   
            System.out.println("Se guardó correctamente la frase :D"); 
        } catch (Exception e) {
            System.out.println(e.getMessage()+"ocurrio un error al guardar XDDD");
        }
        miPrincipal();
    }

    private void listarFrases() {
        List<Frase> frases = repositorio.findAll();
        System.out.println(frases.toString());
        
    }

}
