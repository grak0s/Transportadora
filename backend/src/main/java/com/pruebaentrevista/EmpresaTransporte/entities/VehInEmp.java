package com.pruebaentrevista.EmpresaTransporte.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "emp_veh")
public class VehInEmp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "veh_id")
    private Vehiculo vehiculo;

    @Column(name = "estado")
    private Integer estado;

    public VehInEmp() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehInEmp vehInEmp = (VehInEmp) o;
        return Objects.equals(id, vehInEmp.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
