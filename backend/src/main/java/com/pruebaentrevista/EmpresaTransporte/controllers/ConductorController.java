package com.pruebaentrevista.EmpresaTransporte.controllers;

import com.pruebaentrevista.EmpresaTransporte.entities.Conductor;
import com.pruebaentrevista.EmpresaTransporte.services.ConductorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/conductor")
public class ConductorController {
    @Autowired
    private ConductorServices conductorServices;

    @PostMapping
    public ResponseEntity<Conductor> createConductor(@RequestBody Conductor conductor){
        return new ResponseEntity<Conductor>(conductorServices.createConductor(conductor), HttpStatus.OK);
    }
}
