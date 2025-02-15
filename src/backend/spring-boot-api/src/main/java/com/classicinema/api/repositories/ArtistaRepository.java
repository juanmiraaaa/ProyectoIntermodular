package com.classicinema.api.repositories;

import com.classicinema.api.models.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {

}
