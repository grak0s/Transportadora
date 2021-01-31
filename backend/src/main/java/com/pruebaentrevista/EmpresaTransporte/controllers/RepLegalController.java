package com.pruebaentrevista.EmpresaTransporte.controllers;

import com.pruebaentrevista.EmpresaTransporte.entities.Empresa;
import com.pruebaentrevista.EmpresaTransporte.entities.RepLegal;
import com.pruebaentrevista.EmpresaTransporte.services.RepLegalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/replegal")
public class RepLegalController {

    @Autowired
    private RepLegalServices repLegalServices;

    @GetMapping("/{id}")
    public ResponseEntity<RepLegal> getEmpresaBynoNit(@PathVariable("id") Integer id ){
        return new ResponseEntity<RepLegal>(repLegalServices.getRepLegalbyId(id), HttpStatus.OK);
    }

}
