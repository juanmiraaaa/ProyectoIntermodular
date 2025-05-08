package com.classicinema.api.repositories;

import com.classicinema.api.models.UsuarioGrupo;
import com.classicinema.api.models.UsuarioGrupoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioGrupoRepository extends JpaRepository<UsuarioGrupo, UsuarioGrupoPK> {
}
