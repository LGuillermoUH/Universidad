package com.empleos.empleos3.controllers;

import com.empleos.empleos3.model.entity.Universidad;
import com.empleos.empleos3.model.service.IUniversidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UniversidadController {
	@Autowired
	private IUniversidadService universidadService;
	
	@GetMapping("/Universidades/")
	public List<Universidad> AllUniversidades(){
		return universidadService.findAll();
	}
	
	@PostMapping("/Universidades/Crear")
	public void crearUniversidad(@Valid @RequestBody Universidad universidad) {
		universidadService.save(universidad);
	}
	
	@DeleteMapping("/Universidades/Borrar/{idUniversidad}")
	public void borrarUniversidad(@PathVariable Integer idUniversidad) {
		universidadService.delete(idUniversidad);
	}
	
	@GetMapping("/Universidades/{idUniversidad}")
	public Universidad universidad(@PathVariable Integer idUniversidad) {
		return universidadService.findOne(idUniversidad);
	}
}
