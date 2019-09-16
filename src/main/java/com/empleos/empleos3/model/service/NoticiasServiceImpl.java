package com.empleos.empleos3.model.service;

import com.empleos.empleos3.model.dao.INoticiasDao;
import com.empleos.empleos3.model.entity.Noticias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class NoticiasServiceImpl implements INoticiasService{
    @Autowired
    public INoticiasDao noticiasDao;

    @Override
    @Transactional(readOnly = true)
    public List<Noticias> findAll() {
        return (List<Noticias>) noticiasDao.findAll();
    }

    @Override
    @Transactional
    public Noticias findone(Integer id) {
        return noticiasDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Noticias noticias) {
        noticiasDao.save(noticias);
    }
}
