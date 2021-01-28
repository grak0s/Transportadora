package com.pruebaentrevista.EmpresaTransporte.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "placa")
    private String placa;

    @Column(name = "motor")
    private String motor;

    @Column(name = "chasis")
    private String chasis;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "fecha_matricula")
    private String fechaMatricula;

    @Column(name = "pas_sent")
    private Integer pasSent;

    @Column(name = "pas_dep")
    private Integer pasDep;

    @Column(name = "peso_seco")
    private Integer pesoSeco;

    @Column(name = "peso_bruto")
    private Integer pesoBruto;

    @Column(name = "cant_puertas")
    private Integer cantPuerta;

    @Column(name = "marca")
    private String marca;

    @Column(name = "linea")
    private String linea;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String motor, String chasis, String modelo, String fechaMatricula, Integer pasSent, Integer pasDep, Integer pesoSeco, Integer pesoBruto, Integer cantPuerta, String marca, String linea) {
        this.placa = placa;
        this.motor = motor;
        this.chasis = chasis;
        this.modelo = modelo;
        this.fechaMatricula = fechaMatricula;
        this.pasSent = pasSent;
        this.pasDep = pasDep;
        this.pesoSeco = pesoSeco;
        this.pesoBruto = pesoBruto;
        this.cantPuerta = cantPuerta;
        this.marca = marca;
        this.linea = linea;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public Integer getPasSent() {
        return pasSent;
    }

    public void setPasSent(Integer pasSent) {
        this.pasSent = pasSent;
    }

    public Integer getPasDep() {
        return pasDep;
    }

    public void setPasDep(Integer pasDep) {
        this.pasDep = pasDep;
    }

    public Integer getPesoSeco() {
        return pesoSeco;
    }

    public void setPesoSeco(Integer pesoSeco) {
        this.pesoSeco = pesoSeco;
    }

    public Integer getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Integer pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Integer getCantPuerta() {
        return cantPuerta;
    }

    public void setCantPuerta(Integer cantPuerta) {
        this.cantPuerta = cantPuerta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(id, vehiculo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
