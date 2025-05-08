package com.classicinema.api.models;

import jakarta.persistence.*;

@Entity
@Table( name = "pelicula_idioma" )
public class PeliculaIdioma {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(length = 20, nullable = false, unique = true)
    private String idioma;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
