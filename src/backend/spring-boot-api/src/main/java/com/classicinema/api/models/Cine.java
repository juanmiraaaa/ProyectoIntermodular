package com.classicinema.api.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    @NotNull(message = "nombre no puede ser nulo")
    private String nombre;

    @Column(nullable = false)
    @NotNull(message = "direccion no puede ser nula")
    private String direccion;

    @Column(name = "ubicacion_url", length = 500)
    private String ubicacionUrl;

    @Column(length = 40, nullable = false)
    @NotNull(message = "provincia no puede ser nula")
    private String provincia;

    @Column(length = 12)
    @Pattern(regexp = "^\\+?[0-9]*$", message = "El teléfono debe ser válido")
    private String telefono;

    @Column(length = 100)
    @Email(message = "email debe ser válido")
    private String email;

    @Column(name = "foto_url", length = 500)
    private String fotoUrl;

    @OneToMany(mappedBy = "cine")
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private List<Sala> salas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "nombre no puede ser nulo") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull(message = "nombre no puede ser nulo") String nombre) {
        this.nombre = nombre;
    }

    public @NotNull(message = "direccion no puede ser nula") String getDireccion() {
        return direccion;
    }

    public void setDireccion(@NotNull(message = "direccion no puede ser nula") String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacionUrl() {
        return ubicacionUrl;
    }

    public void setUbicacionUrl(String ubicacionUrl) {
        this.ubicacionUrl = ubicacionUrl;
    }

    public @NotNull(message = "provincia no puede ser nula") String getProvincia() {
        return provincia;
    }

    public void setProvincia(@NotNull(message = "provincia no puede ser nula") String provincia) {
        this.provincia = provincia;
    }

    public @Pattern(regexp = "^\\+?[0-9]*$", message = "El teléfono debe ser válido") String getTelefono() {
        return telefono;
    }

    public void setTelefono(@Pattern(regexp = "^\\+?[0-9]*$", message = "El teléfono debe ser válido") String telefono) {
        this.telefono = telefono;
    }

    public @Email(message = "email debe ser válido") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "email debe ser válido") String email) {
        this.email = email;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}
