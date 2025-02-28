package com.classicinema.api.repositories;

import com.classicinema.api.models.PeliculaArtista;
import com.classicinema.api.models.PeliculaArtistaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaArtistaRepository extends JpaRepository<PeliculaArtista, PeliculaArtistaPK> {
}
