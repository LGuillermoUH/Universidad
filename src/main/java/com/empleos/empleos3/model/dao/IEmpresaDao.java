package com.empleos.empleos3.model.dao;


import com.empleos.empleos3.model.entity.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaDao extends CrudRepository<Empresa,Integer> {
}
