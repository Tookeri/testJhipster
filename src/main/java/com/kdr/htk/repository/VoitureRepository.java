package com.kdr.htk.repository;

import com.kdr.htk.domain.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the {@link Voiture} entity.
 */
@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {}
