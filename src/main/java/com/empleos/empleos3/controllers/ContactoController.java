package com.empleos.empleos3.controllers;


import com.empleos.empleos3.model.entity.Contacto;
import com.empleos.empleos3.model.service.IContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ContactoController {
	@Autowired
	private IContactoService contactoService;
	
	@GetMapping("/Contactos/")
	public List<Contacto> AllContactos(){
		return contactoService.findAll();
	}
	
	@PostMapping("/Contactos/Crear")
	public void crearContacto(@Valid @RequestBody Contacto contacto) {
		contactoService.save(contacto);
	}
	
	@DeleteMapping("/Contactos/Borrar/{idContacto}")
	public void borrarCampus(@PathVariable Integer idContacto) {
		contactoService.delete(idContacto);
	}
	
	@GetMapping("/Contactos/{idContacto}")
	public Contacto contacto(@PathVariable Integer idContacto) {
		return contactoService.findOne(idContacto);
	}
}
