package com.empleos.empleos3.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "universidad")
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "universidad_id")
    private int universidad;
    @Column(name = "nombre_universidad")
    private String nombreUniversidad;
    @Column(name = "correo_universidad")
    private String correoUniversidad;
    @Column(name = "telefono_universidad")
    private String telefonoUniversidad;
    @Column(name = "extencion_telefono")
    private String extencionTelefono;
    @Column(name = "pagina_web")
    private String paginaWeb;
    @Column(name = "bolsa_universidad")
    private String bolsaUniversidad;

    public Universidad() {
    }

    public Universidad(String nombreUniversidad, String correoUniversidad, String telefonoUniversidad, String extencionTelefono, String paginaWeb, String bolsaUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
        this.correoUniversidad = correoUniversidad;
        this.telefonoUniversidad = telefonoUniversidad;
        this.extencionTelefono = extencionTelefono;
        this.paginaWeb = paginaWeb;
        this.bolsaUniversidad = bolsaUniversidad;
    }

    public int getUniversidad() {
        return universidad;
    }

    public void setUniversidad(int universidad) {
        this.universidad = universidad;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getCorreoUniversidad() {
        return correoUniversidad;
    }

    public void setCorreoUniversidad(String correoUniversidad) {
        this.correoUniversidad = correoUniversidad;
    }

    public String getTelefonoUniversidad() {
        return telefonoUniversidad;
    }

    public void setTelefonoUniversidad(String telefonoUniversidad) {
        this.telefonoUniversidad = telefonoUniversidad;
    }

    public String getExtencionTelefono() {
        return extencionTelefono;
    }

    public void setExtencionTelefono(String extencionTelefono) {
        this.extencionTelefono = extencionTelefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getBolsaUniversidad() {
        return bolsaUniversidad;
    }

    public void setBolsaUniversidad(String bolsaUniversidad) {
        this.bolsaUniversidad = bolsaUniversidad;
    }
}
