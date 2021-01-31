package com.pruebaentrevista.EmpresaTransporte.repositories;

import com.pruebaentrevista.EmpresaTransporte.entities.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConductorRepository extends JpaRepository<Conductor, Integer> {
}
