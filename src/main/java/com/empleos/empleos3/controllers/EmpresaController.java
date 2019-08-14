package com.empleos.empleos3.controllers;

import com.empleos.empleos3.model.entity.Empresa;
import com.empleos.empleos3.model.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmpresaController {
	@Autowired
	private IEmpresaService empresaService;
	
	@GetMapping("/Empresas/")
	public List<Empresa> AllEmpresas(){
		return empresaService.findAll();
	}
	
	@PostMapping("/Empresas/Crear")
	public void crearEmpresa(@Valid @RequestBody Empresa empresa) {
		empresaService.save(empresa);
	}
	
	@DeleteMapping("/Empresas/Borrar/{idEmpresa}")
	public void borrarEmpresa(@PathVariable Integer idEmpresa) {
		empresaService.delete(idEmpresa);
	}
	
	@GetMapping("/Empresas/{idEmpresa}")
	public Empresa empresa(@PathVariable Integer idEmpresa) {
		return empresaService.findOne(idEmpresa);
	}
}
