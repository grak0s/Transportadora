package com.pruebaentrevista.EmpresaTransporte.services;


import com.pruebaentrevista.EmpresaTransporte.entities.Empresa;
import com.pruebaentrevista.EmpresaTransporte.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EmpresaServices {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa createEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa getEmpresaBynoNit(Integer noNit){
        return empresaRepository.findBynoNit(noNit)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Empresa no encontrada por Nit %d ", noNit)));
    }

}
