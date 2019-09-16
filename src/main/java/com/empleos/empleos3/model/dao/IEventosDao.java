package com.empleos.empleos3.model.dao;

import com.empleos.empleos3.model.entity.Eventos;
import org.springframework.data.repository.CrudRepository;

public interface IEventosDao extends CrudRepository<Eventos,Integer> {
}
