package com.classicinema.api.repositories;

import com.classicinema.api.models.ArtistaRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRolRepository extends JpaRepository<ArtistaRol, Long> {
}
