package com.classicinema.api.repositories;

import com.classicinema.api.models.Butaca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ButacaRepository extends JpaRepository<Butaca, Long> {
}
