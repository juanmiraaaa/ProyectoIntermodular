package com.classicinema.api.repositories;

import com.classicinema.api.models.Permiso;
import com.classicinema.api.models.PermisoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, PermisoPK> {
}
