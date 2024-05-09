package com.frases.frasesseries.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String poster;
    private String frase;
    private String personaje;

    public Frase() {
    }

    public Frase(String titulo, String poster, String frase, String personaje) {
        this.titulo = titulo;
        this.poster = poster;
        this.frase = frase;
        this.personaje = personaje;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public String getPersonaje() {
        return personaje;
    }
    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Frase [id=" + id + ", titulo=" + titulo + ", poster=" + poster + ", frase=" + frase + ", personaje="
                + personaje + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
