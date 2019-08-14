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
}
