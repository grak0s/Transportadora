package com.pruebaentrevista.EmpresaTransporte.controllers;

import com.pruebaentrevista.EmpresaTransporte.entities.Conductor;
import com.pruebaentrevista.EmpresaTransporte.entities.Vehiculo;
import com.pruebaentrevista.EmpresaTransporte.services.ConductorServices;
import com.pruebaentrevista.EmpresaTransporte.services.VehiculoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoServices vehiculoServices;

    @PostMapping
    public ResponseEntity<Vehiculo> createConductor(@RequestBody Vehiculo vehiculo){
        return new ResponseEntity<Vehiculo>(vehiculoServices.createVehiculo(vehiculo), HttpStatus.OK);
    }
}
