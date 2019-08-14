package com.empleos.empleos3.controllers;


import com.empleos.empleos3.model.entity.Campus;
import com.empleos.empleos3.model.service.ICampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CampusController {
	@Autowired
	private ICampusService campusService;
	
	@GetMapping("/Campus/")
	public List<Campus> AllCampus(){
		return campusService.findAll();
	}
	
	@PostMapping("/Campus/Crear")
	public void crearCampus(@Valid @RequestBody Campus campus) {
		campusService.save(campus);
	}
	
	@DeleteMapping("/Campus/Borrar/{idCampus}")
	public void borrarCampus(@PathVariable Integer idCampus) {
		campusService.delete(idCampus);
	}
	
	@GetMapping("/Campus/{idCampus}")
	public Campus campus(@PathVariable Integer idCampus) {
		return campusService.findOne(idCampus);
	}
}
