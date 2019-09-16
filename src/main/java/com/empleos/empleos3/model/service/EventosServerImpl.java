package com.empleos.empleos3.model.service;

import com.empleos.empleos3.model.dao.IEventosDao;
import com.empleos.empleos3.model.entity.Eventos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventosServerImpl implements IEventosService {
    @Autowired
    public IEventosDao eventosDao;

    @Override
    public List<Eventos> findAll() {
        return (List<Eventos>) eventosDao.findAll();
    }

    @Override
    public void save(Eventos eventos) {
        eventosDao.save(eventos);
    }

    @Override
    public Eventos findOne(Integer id) {
        return eventosDao.findById(id).orElse(null);
    }
}
