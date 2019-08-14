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
}
