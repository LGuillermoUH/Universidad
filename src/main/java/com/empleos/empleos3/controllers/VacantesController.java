package com.empleos.empleos3.controllers;

import com.empleos.empleos3.model.dao.IVacantesDao;
import com.empleos.empleos3.model.entity.IdMapp;
import com.empleos.empleos3.model.entity.Vacantes;
import com.empleos.empleos3.model.service.IVacantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class VacantesController {
    @Autowired
    private IVacantesService vacantesService;

    @Autowired
    private IVacantesDao vacantesDao;

    @GetMapping("/Vacantes/")
    public List<Vacantes> AllVavantes(){
        return vacantesService.findAll();
    }

    @PostMapping("/vacantes/Crear")
    public ResponseEntity crearVacante(@Valid @RequestBody Vacantes vacantes){
        vacantesService.save(vacantes);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/vacante/{IdVacantes}")
    public Vacantes vacante(@PathVariable int id){
        return vacantesService.findOne(id);
    }

    @GetMapping("/vacantes/carrera/{IdCarras}")
    public List<Vacantes> vacantes(@PathVariable int id){
        return vacantesDao.findByCarrerasCarrerasId(id);
    }
}
