package com.empleos.empleos3.model.service;


import com.empleos.empleos3.model.dao.ICarrerasDao;
import com.empleos.empleos3.model.entity.Carreras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarrerasSeviceImpl implements ICarrerasService {
    @Autowired
    public ICarrerasDao carrerasDao;

    @Override
    @Transactional(readOnly = true)
    public List<Carreras> findAll() {
        return (List<Carreras>) carrerasDao.findAll();
    }

    @Override
    @Transactional
    public void save(Carreras carreras) {
        carrerasDao.save(carreras);
    }

    @Override
    @Transactional
    public Carreras findOne(Integer id) {
        return carrerasDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        carrerasDao.deleteById(id);
    }
}
