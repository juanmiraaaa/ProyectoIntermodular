package com.classicinema.api.repositories;

import com.classicinema.api.models.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CineRepository extends JpaRepository<Cine, Long> {
}
