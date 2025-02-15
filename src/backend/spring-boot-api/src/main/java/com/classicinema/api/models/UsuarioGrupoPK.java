package com.classicinema.api.models;

import jakarta.persistence.*;

@Embeddable
public class UsuarioGrupoPK {

    private Long usuario;
    private Long grupo;

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public Long getGrupo() {
        return grupo;
    }

    public void setGrupo(Long grupo) {
        this.grupo = grupo;
    }
}
