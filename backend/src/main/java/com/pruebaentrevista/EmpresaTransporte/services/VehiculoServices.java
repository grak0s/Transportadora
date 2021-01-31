package com.pruebaentrevista.EmpresaTransporte.services;

import com.pruebaentrevista.EmpresaTransporte.entities.Vehiculo;
import com.pruebaentrevista.EmpresaTransporte.repositories.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServices {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    public Vehiculo createVehiculo(Vehiculo vehiculo){
        return vehiculoRepository.save(vehiculo);
    }
}
