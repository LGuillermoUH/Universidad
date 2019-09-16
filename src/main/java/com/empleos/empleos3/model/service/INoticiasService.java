package com.empleos.empleos3.model.service;

import com.empleos.empleos3.model.entity.Noticias;

import java.util.List;

public interface INoticiasService {
    public List<Noticias> findAll();
    public Noticias findone(Integer id);
    public void save(Noticias noticias);
}
