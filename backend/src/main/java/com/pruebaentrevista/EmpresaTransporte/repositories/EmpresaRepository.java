package com.pruebaentrevista.EmpresaTransporte.repositories;

import com.pruebaentrevista.EmpresaTransporte.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
    @Query("SELECT e FROM Empresa  e WHERE e.noNit=?1")
    Optional<Empresa> findBynoNit(Integer noNit);
}
