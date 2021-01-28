package com.pruebaentrevista.EmpresaTransporte.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cond_veh")
public class ConInVeh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "con_id")
    private Conductor conductor;

    @ManyToOne
    @JoinColumn(name = "veh_id")
    private Vehiculo vehiculo;

    @Column(name = "estado")
    private Integer estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
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
        ConInVeh conInVeh = (ConInVeh) o;
        return Objects.equals(id, conInVeh.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
