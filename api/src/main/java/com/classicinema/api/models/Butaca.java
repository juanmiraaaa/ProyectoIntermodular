package com.classicinema.api.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.validation.constraints.*;

@Entity
@Table(
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"sala_id", "fila", "columna"}),
        }
)
public class Butaca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sala_id", nullable = false)
    @NotNull(message = "sala no puede ser nulo")
    private Sala sala;

    @Column(length = 20, nullable = false)
    @NotNull(message = "seccion no puede ser nulo")
    private String seccion;

    @Column(length = 2, nullable = false)
    @NotNull(message = "fila no puede ser nulo")
    private String fila;

    @Column(length = 2, nullable = false)
    @NotNull(message = "columna no puede ser nulo")
    private String columna;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "sala no puede ser nulo") Sala getSala() {
        return sala;
    }

    public void setSala(@NotNull(message = "sala no puede ser nulo") Sala sala) {
        this.sala = sala;
    }

    public @NotNull(message = "seccion no puede ser nulo") String getSeccion() {
        return seccion;
    }

    public void setSeccion(@NotNull(message = "seccion no puede ser nulo") String seccion) {
        this.seccion = seccion;
    }

    public @NotNull(message = "fila no puede ser nulo") String getFila() {
        return fila;
    }

    public void setFila(@NotNull(message = "fila no puede ser nulo") String fila) {
        this.fila = fila;
    }

    public @NotNull(message = "columna no puede ser nulo") String getColumna() {
        return columna;
    }

    public void setColumna(@NotNull(message = "columna no puede ser nulo") String columna) {
        this.columna = columna;
    }
}
