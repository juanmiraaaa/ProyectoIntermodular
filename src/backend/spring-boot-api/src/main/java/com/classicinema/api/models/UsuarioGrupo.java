package com.classicinema.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_grupo")
public class UsuarioGrupo {

    @EmbeddedId
    private UsuarioGrupoPK id;

    @ManyToOne
    @MapsId("usuario")
    @JoinColumn(name = "usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @MapsId("grupo")
    @JoinColumn(name = "grupo", nullable = false)
    private Grupo grupo;

    public UsuarioGrupoPK getId() {
        return id;
    }

    public void setId(UsuarioGrupoPK id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
