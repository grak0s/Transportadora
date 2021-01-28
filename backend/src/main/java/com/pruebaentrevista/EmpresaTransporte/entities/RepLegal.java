package com.pruebaentrevista.EmpresaTransporte.entities;


import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "replegal")
public class RepLegal {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tipoDocumento")
    private String tipoDocumento;

    @Column(name = "noDocumento")
    private BigInteger noDocumento;

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

    public RepLegal() {
    }

    public RepLegal(String tipoDocumento, BigInteger noDocumento, String nombres, String direccion, String telefono, String ciudad, String depto, String pais) {
        this.tipoDocumento = tipoDocumento;
        this.noDocumento = noDocumento;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.depto = depto;
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public BigInteger getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(BigInteger noDocumento) {
        this.noDocumento = noDocumento;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepLegal repLegal = (RepLegal) o;
        return Objects.equals(id, repLegal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
