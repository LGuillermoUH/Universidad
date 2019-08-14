package com.empleos.empleos3.model.service;



import com.empleos.empleos3.model.entity.Contacto;

import java.util.List;

public interface IContactoService {
     List<Contacto> findAll();
     void save(Contacto contacto);
     Contacto findOne(Integer id);
     void delete(Integer id);
}
