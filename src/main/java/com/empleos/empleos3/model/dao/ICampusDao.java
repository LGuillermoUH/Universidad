package com.empleos.empleos3.model.dao;


import com.empleos.empleos3.model.entity.Campus;
import org.springframework.data.repository.CrudRepository;

public interface ICampusDao extends CrudRepository<Campus,Integer> {
}
