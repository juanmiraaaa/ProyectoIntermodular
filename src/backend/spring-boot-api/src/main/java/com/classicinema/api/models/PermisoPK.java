package com.classicinema.api.models;

import jakarta.persistence.*;

@Embeddable
public class PermisoPK {

    private Long grupo;

    @Column( name = "entidad_administrada" )
    private Long entidadAdministrada;

    @Column( name = "tipo_permiso" )
    private Long tipoPermiso;

    public Long getGrupo() {
        return grupo;
    }

    public void setGrupo(Long grupo) {
        this.grupo = grupo;
    }

    public Long getEntidadAdministrada() {
        return entidadAdministrada;
    }

    public void setEntidadAdministrada(Long entidadAdministrada) {
        this.entidadAdministrada = entidadAdministrada;
    }

    public Long getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(Long tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }
}