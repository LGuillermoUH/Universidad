package com.empleos.empleos3.controllers;

import com.empleos.empleos3.model.entity.Noticias;
import com.empleos.empleos3.model.service.INoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class NoticiasController {
    @Autowired
    private INoticiasService noticiasService;
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("/Noticias/Crear")
    public void crearNoticia(@Valid @RequestBody Noticias noticias){
        noticiasService.save(noticias);
    }
    @GetMapping("/Universidad")
    public List<Noticias> AllNoticias(){return noticiasService.findAll();}



}
