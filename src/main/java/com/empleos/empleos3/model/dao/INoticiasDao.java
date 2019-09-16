package com.empleos.empleos3.model.dao;

import com.empleos.empleos3.model.entity.Noticias;
import org.springframework.data.repository.CrudRepository;

public interface INoticiasDao extends CrudRepository<Noticias,Integer> {
}
