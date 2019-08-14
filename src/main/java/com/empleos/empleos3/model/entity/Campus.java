package com.empleos.empleos3.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "campus")
public class Campus{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "campus_id")
    private int campusId;
    @Column(name = "nombre_campus")
    private String nombreCampus;
    @Column(name = "calle_campus")
    private String calleCampus;
    @Column(name = "numero_calle_campus")
    private String numeroCalleCampus;
    @Column(name = "colonia_campus")
    private String coloniaCampus;
    @Column(name = "codigo_postal_campus")
    private String codigoPostalCampus;
    @Column(name = "municipio_campus")
    private String municipioCampus;
    @Column(name = "estado_campus")
    private String estadoCampus;
    @OneToOne
    private Universidad universidad;
    @OneToOne
    private Contacto contacto;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "campus_carrera",  joinColumns = { @JoinColumn(name = "campus_id", referencedColumnName = "campus_id") },
            inverseJoinColumns = { @JoinColumn(name = "carreras_id", referencedColumnName = "carreras_id") })
    private Set<Carreras> carreras;



    public Campus() {
    }

    public Campus(String nombreCampus, String calleCampus, String numeroCalleCampus, String coloniaCampus, String codigoPostalCampus, String municipioCampus, String estadoCampus, Universidad universidad, Contacto contacto, Set<Carreras> carreras) {
        this.nombreCampus = nombreCampus;
        this.calleCampus = calleCampus;
        this.numeroCalleCampus = numeroCalleCampus;
        this.coloniaCampus = coloniaCampus;
        this.codigoPostalCampus = codigoPostalCampus;
        this.municipioCampus = municipioCampus;
        this.estadoCampus = estadoCampus;
        this.universidad = universidad;
        this.contacto = contacto;
        this.carreras = carreras;
    }

    public Set<Carreras> getCarreras() {
        return carreras;
    }

    public void setCarreras(Set<Carreras> carreras) {
        this.carreras = carreras;
    }

    public int getCampusId() {
        return campusId;
    }

    public void setCampusId(int campusId) {
        this.campusId = campusId;
    }

    public String getNombreCampus() {
        return nombreCampus;
    }

    public void setNombreCampus(String nombreCampus) {
        this.nombreCampus = nombreCampus;
    }

    public String getCalleCampus() {
        return calleCampus;
    }

    public void setCalleCampus(String calleCampus) {
        this.calleCampus = calleCampus;
    }

    public String getNumeroCalleCampus() {
        return numeroCalleCampus;
    }

    public void setNumeroCalleCampus(String numeroCalleCampus) {
        this.numeroCalleCampus = numeroCalleCampus;
    }

    public String getColoniaCampus() {
        return coloniaCampus;
    }

    public void setColoniaCampus(String coloniaCampus) {
        this.coloniaCampus = coloniaCampus;
    }

    public String getCodigoPostalCampus() {
        return codigoPostalCampus;
    }

    public void setCodigoPostalCampus(String codigoPostalCampus) {
        this.codigoPostalCampus = codigoPostalCampus;
    }

    public String getMunicipioCampus() {
        return municipioCampus;
    }

    public void setMunicipioCampus(String municipioCampus) {
        this.municipioCampus = municipioCampus;
    }

    public String getEstadoCampus() {
        return estadoCampus;
    }

    public void setEstadoCampus(String estadoCampus) {
        this.estadoCampus = estadoCampus;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}
