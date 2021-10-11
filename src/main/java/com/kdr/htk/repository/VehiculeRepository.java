package com.kdr.htk.repository;

import com.kdr.htk.domain.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the {@link Vehicule} entity.
 */
@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {}
