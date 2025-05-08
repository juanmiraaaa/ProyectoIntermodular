package com.classicinema.api.models;

import jakarta.persistence.*;

@Entity
@Table(
        name = "pelicula_artista"
)
public class PeliculaArtista {

    @EmbeddedId
    private PeliculaArtistaPK id;

    @ManyToOne
    @MapsId("artistaId")
    private Artista artista;

    @ManyToOne
    @MapsId("peliculaId")
    private Pelicula pelicula;

    @ManyToOne
    @MapsId("rol")
    private ArtistaRol rol;

    public PeliculaArtistaPK getId() {
        return id;
    }

    public void setId(PeliculaArtistaPK id) {
        this.id = id;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArtistaRol getRol() {
        return rol;
    }

    public void setRol(ArtistaRol rol) {
        this.rol = rol;
    }
}
