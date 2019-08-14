package com.empleos.empleos3.model.service;


import com.empleos.empleos3.model.entity.Universidad;

import java.util.List;

public interface IUniversidadService {
    public List<Universidad> findAll();
    public void save(Universidad universidad);
    public Universidad findOne(Integer id);
    public void delete(Integer id);
}
