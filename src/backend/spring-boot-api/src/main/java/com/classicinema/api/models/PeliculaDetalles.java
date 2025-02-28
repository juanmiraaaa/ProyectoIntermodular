package com.classicinema.api.models;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table( name = "pelicula_detalles" )
public class PeliculaDetalles {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

    @Column(length = 2000)
    private String sinopsis;

    @Column(length = 500)
    private String sinopsisCorta;

    @Column(length = 10)
    private String duracion;

    @Column(name = "trailer_url")
    private String trailerUrl;

    @Column(name = "cartelera_url")
    private String carteleraUrl;

    @Column(name = "banner_url")
    private String bannerUrl;

    private Short pegi;

    @Column(name = "fecha_estreno")
    private LocalDate fechaEstreno;

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

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getSinopsisCorta() {
        return sinopsisCorta;
    }

    public void setSinopsisCorta(String sinopsisCorta) {
        this.sinopsisCorta = sinopsisCorta;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public String getCarteleraUrl() {
        return carteleraUrl;
    }

    public void setCarteleraUrl(String carteleraUrl) {
        this.carteleraUrl = carteleraUrl;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public Short getPegi() {
        return pegi;
    }

    public void setPegi(Short pegi) {
        this.pegi = pegi;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
}
