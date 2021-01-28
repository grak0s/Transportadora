package com.pruebaentrevista.EmpresaTransporte.controllers;


import com.pruebaentrevista.EmpresaTransporte.entities.Empresa;
import com.pruebaentrevista.EmpresaTransporte.services.EmpresaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaServices empresaServices;

    @PostMapping
    public ResponseEntity<Empresa> createEmpresa(@RequestBody Empresa empresa){
        return new ResponseEntity<Empresa>(empresaServices.createEmpresa(empresa), HttpStatus.OK);
    }

    @GetMapping("/{noNit}")
    public ResponseEntity<Empresa> getEmpresaBynoNit(@PathVariable("noNit") Integer noNit ){
        return new ResponseEntity<Empresa>(empresaServices.getEmpresaBynoNit(noNit), HttpStatus.OK);
    }


}
