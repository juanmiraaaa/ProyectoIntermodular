package com.classicinema.api.models;

import jakarta.persistence.*;

@Entity
public class Permiso {

    @EmbeddedId
    private PermisoPK id;

    @ManyToOne
    @MapsId("grupo")
    @JoinColumn(name = "grupo", nullable = false)
    private Grupo grupo;

    @ManyToOne
    @MapsId("entidadAdministrada")
    @JoinColumn(name = "entidad_administrada", nullable = false)
    private EntidadAdministrada entidadAdministrada;

    @ManyToOne
    @MapsId("tipoPermiso")
    @JoinColumn(name = "tipo_permiso", nullable = false)
    private TipoPermiso tipoPermiso;

    public PermisoPK getId() {
        return id;
    }

    public void setId(PermisoPK id) {
        this.id = id;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public EntidadAdministrada getEntidadAdministrada() {
        return entidadAdministrada;
    }

    public void setEntidadAdministrada(EntidadAdministrada entidadAdministrada) {
        this.entidadAdministrada = entidadAdministrada;
    }

    public TipoPermiso getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(TipoPermiso tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }
}
