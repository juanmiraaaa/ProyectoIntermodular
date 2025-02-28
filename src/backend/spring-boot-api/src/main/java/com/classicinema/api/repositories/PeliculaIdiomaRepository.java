package com.classicinema.api.repositories;

import com.classicinema.api.models.PeliculaIdioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaIdiomaRepository extends JpaRepository<PeliculaIdioma, Long> {
}
