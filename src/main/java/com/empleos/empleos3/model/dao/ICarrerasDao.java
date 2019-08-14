package com.empleos.empleos3.model.dao;


import com.empleos.empleos3.model.entity.Carreras;
import org.springframework.data.repository.CrudRepository;

public interface ICarrerasDao extends CrudRepository<Carreras,Integer> {
}
