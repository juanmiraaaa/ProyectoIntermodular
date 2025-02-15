package com.classicinema.api.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table( name = "pelicula_tipo" )
public class PeliculaTipo {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(nullable = false, unique = true)
    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
