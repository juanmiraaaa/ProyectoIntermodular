package com.classicinema.api.repositories;

import com.classicinema.api.models.PeliculaDetalles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaDetallesRepository extends JpaRepository<PeliculaDetalles, Long> {
}
