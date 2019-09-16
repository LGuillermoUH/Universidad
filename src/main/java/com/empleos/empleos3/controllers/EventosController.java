package com.empleos.empleos3.controllers;

import com.empleos.empleos3.model.entity.Eventos;
import com.empleos.empleos3.model.service.IEventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public class EventosController {
    @Autowired
    private IEventosService eventosService;
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("/Eventos/Crear")
    public void CrearEvento(@Valid @RequestBody Eventos eventos){
        eventosService.save(eventos);
    }
    @GetMapping("/Eventos")
    public List<Eventos> AllEventos(){
        return (List<Eventos>) eventosService.findAll();
    }
}
