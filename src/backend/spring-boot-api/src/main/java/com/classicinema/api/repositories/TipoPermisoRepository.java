package com.classicinema.api.repositories;

import com.classicinema.api.models.TipoPermiso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPermisoRepository extends JpaRepository<TipoPermiso, Long> {
}
