package com.empleos.empleos3.model.entity;

import javax.persistence.*;
@Entity
@Table(name = "contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contacto_id")
    private int contactoEmpresaId;
    @Column(name = "nombre_contacto")
    private String nombreContacto;
    @Column(name = "apellido_paterno_contacto")
    private String apellidoPaternoContacto;
    @Column(name = "apellido_materno_contacto")
    private String apellidoMaternoContacto;
    @Column(name = "cargo_contacto")
    private String cargoContacto;
    @Column(name = "celular_contacto")
    private String celularContacto;
    @Column(name = "telefono_contacto")
    private String telefonoContacto;
    @Column(name = "extencion_contacto")
    private String extencionTelefonoContacto;
    @Column(name = "email_contacto")
    private String EmailContacto;

    public Contacto() {
    }

    public Contacto(String nombreContacto, String apellidoPaternoContacto, String apellidoMaternoContacto, String cargoContacto, String celularContacto, String telefonoContacto, String extencionTelefonoContacto, String emailContacto) {
        this.nombreContacto = nombreContacto;
        this.apellidoPaternoContacto = apellidoPaternoContacto;
        this.apellidoMaternoContacto = apellidoMaternoContacto;
        this.cargoContacto = cargoContacto;
        this.celularContacto = celularContacto;
        this.telefonoContacto = telefonoContacto;
        this.extencionTelefonoContacto = extencionTelefonoContacto;
        EmailContacto = emailContacto;
    }

    public int getContactoEmpresaId() {
        return contactoEmpresaId;
    }

    public void setContactoEmpresaId(int contactoEmpresaId) {
        this.contactoEmpresaId = contactoEmpresaId;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getApellidoPaternoContacto() {
        return apellidoPaternoContacto;
    }

    public void setApellidoPaternoContacto(String apellidoPaternoContacto) {
        this.apellidoPaternoContacto = apellidoPaternoContacto;
    }

    public String getApellidoMaternoContacto() {
        return apellidoMaternoContacto;
    }

    public void setApellidoMaternoContacto(String apellidoMaternoContacto) {
        this.apellidoMaternoContacto = apellidoMaternoContacto;
    }

    public String getCargoContacto() {
        return cargoContacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
    }

    public String getCelularContacto() {
        return celularContacto;
    }

    public void setCelularContacto(String celularContacto) {
        this.celularContacto = celularContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getExtencionTelefonoContacto() {
        return extencionTelefonoContacto;
    }

    public void setExtencionTelefonoContacto(String extencionTelefonoContacto) {
        this.extencionTelefonoContacto = extencionTelefonoContacto;
    }

    public String getEmailContacto() {
        return EmailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        EmailContacto = emailContacto;
    }
}
