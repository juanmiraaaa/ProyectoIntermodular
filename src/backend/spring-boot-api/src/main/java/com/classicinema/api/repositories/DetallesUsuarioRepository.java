package com.classicinema.api.repositories;

import com.classicinema.api.models.DetallesUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesUsuarioRepository extends JpaRepository<DetallesUsuario, Long> {
}
