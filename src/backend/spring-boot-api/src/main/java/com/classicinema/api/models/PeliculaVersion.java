package com.classicinema.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "pelicula_version")
public class PeliculaVersion {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pelicula_id", nullable = false)
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private PeliculaTipo tipo;

    @ManyToOne
    @JoinColumn(name = "idioma_id")
    private PeliculaIdioma idioma;

    @Column(name="has_subtitulos")
    private Boolean hasSubtitulos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public PeliculaTipo getTipo() {
        return tipo;
    }

    public void setTipo(PeliculaTipo tipo) {
        this.tipo = tipo;
    }

    public PeliculaIdioma getIdioma() {
        return idioma;
    }

    public void setIdioma(PeliculaIdioma idioma) {
        this.idioma = idioma;
    }

    public Boolean getHasSubtitulos() {
        return hasSubtitulos;
    }

    public void setHasSubtitulos(Boolean hasSubtitulos) {
        this.hasSubtitulos = hasSubtitulos;
    }
}
