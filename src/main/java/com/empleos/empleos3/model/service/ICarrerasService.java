package com.empleos.empleos3.model.service;


import com.empleos.empleos3.model.entity.Carreras;

import java.util.List;

public interface ICarrerasService {
    public List<Carreras> findAll();
    public void save(Carreras carreras);
    public Carreras findOne(Integer id);
    public void delete(Integer id);
}
