package com.empleos.empleos3.controllers;


import com.empleos.empleos3.model.entity.Carreras;
import com.empleos.empleos3.model.service.ICarrerasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CarrerasController {
	@Autowired
	private ICarrerasService carrerasService;
	
	@GetMapping("/Carreras/")
	public List<Carreras> AllCarreras(){
		return carrerasService.findAll();
	}
	
	@PostMapping("/Carreras/Crear")
	public void crearCarrera(@Valid @RequestBody Carreras carreras) {
		carrerasService.save(carreras);
	}
	
	@DeleteMapping("/Carreras/Borrar/{idCarrera}")
	public void borrarCarrera(@PathVariable Integer idCarrera) {
		carrerasService.delete(idCarrera);
	}
	
	@GetMapping("/Carreras/{idCarrera}")
	public Carreras carrera(@PathVariable Integer idCarrera) {
		return carrerasService.findOne(idCarrera);
	}
}
