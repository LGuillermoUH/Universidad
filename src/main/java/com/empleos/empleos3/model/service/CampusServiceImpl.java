package com.empleos.empleos3.model.service;

import com.empleos.empleos3.model.dao.ICampusDao;
import com.empleos.empleos3.model.entity.Campus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CampusServiceImpl implements ICampusService {
    @Autowired
    private ICampusDao campusDao;

    @Override
    @Transactional(readOnly = true)
    public List<Campus> findAll() {
        return (List<Campus>) campusDao.findAll();
    }

    @Override
    @Transactional
    public void save(Campus campus) {
        campusDao.save(campus);
    }

    @Override
    @Transactional
    public Campus findOne(Integer id) {
        return campusDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        campusDao.deleteById(id);
    }
}
