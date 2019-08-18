package com.empleos.empleos3.model.service;

import com.empleos.empleos3.model.dao.IVacantesDao;
import com.empleos.empleos3.model.entity.Vacantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class VacanterServiceImpl implements IVacantesService{
    @Autowired
    public IVacantesDao vacantesDao;
    @Transactional(readOnly = true)
    @Override
    public List<Vacantes> findAll() {
        return (List<Vacantes>) vacantesDao.findAll();
    }
    @Transactional
    @Override
    public void save(Vacantes vacantes) {
        vacantesDao.save(vacantes);
    }
    @Transactional
    @Override
    public Vacantes findOne(Integer id) {
        return vacantesDao.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(Integer id) {
        vacantesDao.deleteById(id);
    }
}
