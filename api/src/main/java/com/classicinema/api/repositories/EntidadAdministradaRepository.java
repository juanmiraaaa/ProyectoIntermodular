package com.classicinema.api.repositories;

import com.classicinema.api.models.EntidadAdministrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadAdministradaRepository extends JpaRepository<EntidadAdministrada, Long> {
}
