package com.classicinema.api.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cine_id", nullable = false)
    @NotNull(message = "cine_id debe no ser nulo")
    private Cine cine;

    @Column(length = 30, nullable = false)
    @NotNull(message = "nombre no puede ser nulo")
    private String nombre;

    @Column(name = "aforo_maximo", nullable = false)
    @NotNull(message = "aforo_maximo no puede ser nulo")
    private int aforoMaximo;

    @OneToMany(mappedBy = "sala")
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private List<Butaca> butacas;

    @OneToMany(mappedBy = "sala")
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private List<Sesion> sesiones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "cine_id debe no ser nulo") Cine getCine() {
        return cine;
    }

    public void setCine(@NotNull(message = "cine_id debe no ser nulo") Cine cine) {
        this.cine = cine;
    }

    public @NotNull(message = "nombre no puede ser nulo") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull(message = "nombre no puede ser nulo") String nombre) {
        this.nombre = nombre;
    }

    @NotNull(message = "aforo_maximo no puede ser nulo")
    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(@NotNull(message = "aforo_maximo no puede ser nulo") int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public List<Butaca> getButacas() {
        return butacas;
    }

    public void setButacas(List<Butaca> butacas) {
        this.butacas = butacas;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }
}
