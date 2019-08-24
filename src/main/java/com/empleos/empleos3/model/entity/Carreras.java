package com.empleos.empleos3.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "carreras")
public class Carreras {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "carreras_id")
    private int carrerasId;
    @Column(name = "Carrera")
    private String carrera;

    public Carreras() {
    }

    public Carreras(String carrera) {
        this.carrera = carrera;
    }

    public int getCarrerasId() {
        return carrerasId;
    }

    public void setCarrerasId(int carrerasId) {
        this.carrerasId = carrerasId;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
