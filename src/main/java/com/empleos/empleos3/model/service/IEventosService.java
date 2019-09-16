package com.empleos.empleos3.model.service;

import com.empleos.empleos3.model.entity.Eventos;
import com.empleos.empleos3.model.entity.Universidad;

import java.util.List;

public interface IEventosService{
    List<Eventos> findAll();
    void save(Eventos eventos);
    Eventos findOne(Integer id);
}
