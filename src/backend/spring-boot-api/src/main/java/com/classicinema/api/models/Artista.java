package com.classicinema.api.models;

import jakarta.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    @Column(length = 20)
    private String nombre;

    @NotNull
    @Column(length = 40)
    private String apellido;

    @Column(length = 40)
    private String nacionalidad;

    @Column(name = "fecha_nacimiento")
    @Past
    private LocalDate fechaNacimiento;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull String nombre) {
        this.nombre = nombre;
    }

    public @NotNull String getApellido() {
        return apellido;
    }

    public void setApellido(@NotNull String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public @Past LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(@Past LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
