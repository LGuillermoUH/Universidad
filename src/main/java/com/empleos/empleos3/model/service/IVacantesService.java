package com.empleos.empleos3.model.service;

import com.empleos.empleos3.model.entity.Vacantes;

import java.util.List;

public interface IVacantesService {
    List<Vacantes> findAll();
    void save(Vacantes vacantes);
    Vacantes findOne(Integer id);
    void delete(Integer id);
}
