package com.empleos.empleos3.model.dao;


import com.empleos.empleos3.model.entity.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface IContactoDao extends CrudRepository<Contacto,Integer> {
}
