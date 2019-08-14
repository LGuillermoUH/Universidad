package com.empleos.empleos3.model.service;


import com.empleos.empleos3.model.entity.Campus;

import java.util.List;

public interface ICampusService {
    public List<Campus> findAll();
    public void save(Campus campus);
    public Campus findOne(Integer id);
    public void delete(Integer id);
}
