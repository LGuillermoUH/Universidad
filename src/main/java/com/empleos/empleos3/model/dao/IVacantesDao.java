package com.empleos.empleos3.model.dao;

import com.empleos.empleos3.model.entity.Vacantes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IVacantesDao extends CrudRepository<Vacantes,Integer> {
    List<Vacantes> findByCarrerasCarrerasId(int id);
}
