package com.classicinema.api.models;

import jakarta.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name="detalles_usuario")
public class DetallesUsuario {

    @Id
    private Long id;  // La clave primaria debe ser un tipo primitivo, no un objeto

    @OneToOne
    @MapsId  // Indica que este campo usa el mismo ID que Usuario
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(length = 20)
    private String nombre;

    @Column(length = 20)
    private String apellido1;

    @Column(length = 20)
    private String apellido2;

    @Past
    @Column(name = "fecha_nacimiento", columnDefinition = "DATE")
    private LocalDate fechaNacimiento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public @Past LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(@Past LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
