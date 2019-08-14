package com.empleos.empleos3.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empresa_id")
    private int empresaId;

    @Column(name = "nombre_empresa")
    private String nombreEmpresa;

    @Column(name="rfc")
    private String rfc;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero_calle")
    private String numeroCalle;

    @Column(name ="colonia")
    private String colonia;

    @Column(name = "codigo_postal")
    private int codigoPostal;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "estado")
    private String estado;

    @Column(name = "pais")
    private String pais;

    @Column(name = "pagina_web")
    private String paginaWeb;

    @Column(name = "tamano_empresa")
    private String tamanoEmpresa;

    @OneToOne
    private Contacto contacto;

    public Empresa() {
    }

    public Empresa(String nombreEmpresa, String rfc, String razonSocial, String calle, String numeroCalle, String colonia, int codigoPostal, String ciudad, String municipio, String estado, String pais, String paginaWeb, String tamanoEmpresa, Contacto contacto) {
        this.nombreEmpresa = nombreEmpresa;
        this.rfc = rfc;
        this.razonSocial = razonSocial;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.estado = estado;
        this.pais = pais;
        this.paginaWeb = paginaWeb;
        this.tamanoEmpresa = tamanoEmpresa;
        this.contacto = contacto;
    }

    public int getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(int empresaId) {
        this.empresaId = empresaId;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getTamanoEmpresa() {
        return tamanoEmpresa;
    }

    public void setTamanoEmpresa(String tamanoEmpresa) {
        this.tamanoEmpresa = tamanoEmpresa;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}
