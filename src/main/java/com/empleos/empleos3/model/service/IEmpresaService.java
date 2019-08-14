package com.empleos.empleos3.model.service;


import com.empleos.empleos3.model.entity.Empresa;

import java.util.List;

public interface IEmpresaService {
    public List<Empresa> findAll();
    public void save(Empresa empresa);
    public Empresa findOne(Integer id);
    public void delete(Integer id);
}
