package com.pruebaentrevista.EmpresaTransporte.services;

import com.pruebaentrevista.EmpresaTransporte.entities.Conductor;
import com.pruebaentrevista.EmpresaTransporte.repositories.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConductorServices {

    @Autowired
    private ConductorRepository conductorRepository;

    public Conductor createConductor(Conductor conductor){
        return conductorRepository.save(conductor);
    }

}
