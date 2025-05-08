package com.classicinema.api.repositories;

import com.classicinema.api.models.PeliculaTipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaTipoRepository extends JpaRepository<PeliculaTipo, Long> {
}
