package com.classicinema.api.models;

import jakarta.persistence.*;

@Embeddable
public class PeliculaArtistaPK {

    @Column( name = "pelicula_id" )
    private Long peliculaId;

    @Column( name = "artista_id" )
    private Long artistaId;

    private Long rol;

    public Long getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(Long peliculaId) {
        this.peliculaId = peliculaId;
    }

    public Long getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(Long artistaId) {
        this.artistaId = artistaId;
    }

    public Long getRol() {
        return rol;
    }

    public void setRol(Long rol) {
        this.rol = rol;
    }
}
