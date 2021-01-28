package com.pruebaentrevista.EmpresaTransporte.entities;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tipoNit")
    private String tipoNit;

    @Column(name = "noNit")
    private Integer noNit;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "depto")
    private String depto;

    @Column(name = "pais")
    private String pais;

    @ManyToOne
    @JoinColumn(name = "id_repLegal",referencedColumnName = "id")
    private RepLegal repLegal;

    public Empresa() {
    }

    public Empresa(String tipoNit, Integer noNit, String nombres, String direccion, String telefono, String ciudad, String depto, String pais, RepLegal repLegal) {
        this.tipoNit = tipoNit;
        this.noNit = noNit;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.depto = depto;
        this.pais = pais;
        this.repLegal = repLegal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoNit() {
        return tipoNit;
    }

    public void setTipoNit(String tipoNit) {
        this.tipoNit = tipoNit;
    }

    public Integer getNoNit() {
        return noNit;
    }

    public void setNoNit(Integer noNit) {
        this.noNit = noNit;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public RepLegal getRepLegal() {
        return repLegal;
    }

    public void setRepLegal(RepLegal repLegal) {
        this.repLegal = repLegal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(id, empresa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
