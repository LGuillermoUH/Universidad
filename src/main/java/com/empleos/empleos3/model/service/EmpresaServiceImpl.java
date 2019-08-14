package com.empleos.empleos3.model.service;


import com.empleos.empleos3.model.dao.IEmpresaDao;
import com.empleos.empleos3.model.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService {
    @Autowired
    public IEmpresaDao empresaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empresa> findAll() {
        return (List<Empresa>) empresaDao.findAll();
    }

    @Override
    @Transactional
    public void save(Empresa empresa) {
        empresaDao.save(empresa);
    }

    @Override
    @Transactional
    public Empresa findOne(Integer id) {
        return empresaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        empresaDao.deleteById(id);
    }
}
