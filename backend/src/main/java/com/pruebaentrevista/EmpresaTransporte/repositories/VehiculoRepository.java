package com.pruebaentrevista.EmpresaTransporte.repositories;

import com.pruebaentrevista.EmpresaTransporte.entities.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
}
