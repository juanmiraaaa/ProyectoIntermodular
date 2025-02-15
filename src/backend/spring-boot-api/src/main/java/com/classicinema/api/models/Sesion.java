package com.classicinema.api.models;

import jakarta.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "pelicula_version", nullable = false)
    private PeliculaVersion peliculaVersion;

    @Column(columnDefinition = "TIME", nullable = false)
    private LocalDate hora;

    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate fecha;

    @Column(name = "precio_base", nullable = false)
    private Double precioBase;

    private Double descuento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public PeliculaVersion getPeliculaVersion() {
        return peliculaVersion;
    }

    public void setPeliculaVersion(PeliculaVersion peliculaVersion) {
        this.peliculaVersion = peliculaVersion;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
}
