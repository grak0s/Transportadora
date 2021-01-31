package com.pruebaentrevista.EmpresaTransporte.repositories;


import com.pruebaentrevista.EmpresaTransporte.entities.RepLegal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepLegalRepository extends JpaRepository<RepLegal, Integer> {
}

