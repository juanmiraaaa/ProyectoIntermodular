package com.classicinema.api.repositories;

import com.classicinema.api.models.PeliculaVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaVersionRepository extends JpaRepository<PeliculaVersion, Long> {
}
