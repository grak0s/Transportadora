package com.pruebaentrevista.EmpresaTransporte.services;

import com.pruebaentrevista.EmpresaTransporte.entities.RepLegal;
import com.pruebaentrevista.EmpresaTransporte.repositories.RepLegalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RepLegalServices {

    @Autowired
    private RepLegalRepository repLegalRepository;

    public RepLegal createRepLegal(RepLegal repLegal){
        return repLegalRepository.save(repLegal);
    }

    public RepLegal getRepLegalbyId(Integer id){
        return repLegalRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("RepLegal no encontrada por ID %d ", id)));
    }

}
