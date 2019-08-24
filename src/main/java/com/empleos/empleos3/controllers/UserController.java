package com.empleos.empleos3.controllers;

import com.empleos.empleos3.model.dao.IRolesDao;
import com.empleos.empleos3.model.entity.Empresa;
import com.empleos.empleos3.model.entity.Role;
import com.empleos.empleos3.model.entity.Users;
import com.empleos.empleos3.model.service.IContactoService;
import com.empleos.empleos3.model.service.IEmpresaService;
import com.empleos.empleos3.model.service.IRoleService;
import com.empleos.empleos3.model.service.IUserService;
import com.google.common.collect.Lists;
import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;
import it.ozimov.springboot.mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.internet.InternetAddress;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService rolesDao;
    @Autowired
    public EmailService emailService;
    @Autowired
    public IContactoService contactoService;
    @Autowired
    public IEmpresaService empresaService;
    public void sendEmailWithoutTemplating(Integer idPersona) throws UnsupportedEncodingException {
        final Email email = DefaultEmail.builder()
                .from(new InternetAddress("pruebas.hext.pruebas@gmail.com", "Marco Tullio Cicerone "))
                .to(Lists.newArrayList(new InternetAddress("luisg1.luis@gmail.com", "Luis guillermo")))
                .subject("Laelius de amicitia")
                .body("https://pruebasempleos.herokuapp.com/Usuarios/Autorizar/"+idPersona)
                .encoding("UTF-8").build();

        emailService.send(email);
    }
    //obtiene todos los usuarios
    @GetMapping("/Usuarios")
    public List<Users> AllUsers(){
        return userService.findAll();
    }
    //insert
    @PostMapping("/Usuarios/Registro")
    public void crearUsuario(@RequestBody Users users) throws UnsupportedEncodingException {
        users.setCampus(null);
        users.setActive(0);
        contactoService.save(users.getEmpresa().getContacto());
        empresaService.save(users.getEmpresa());
        Set<Role> roles = new HashSet<Role>();
        roles.add(rolesDao.findOne(2));
        users.setRoles(roles);
        sendEmailWithoutTemplating(users.getId());
        userService.save(users);
         
    }
    //delete
    @DeleteMapping("/Usuarios/Borrar/{idUsuario}")
    public void borrarUsuario(@PathVariable Integer idUsuario){
        userService.delete(idUsuario);
    }
    //un solo usuario
    @GetMapping("/Usuarios/{idUsuario}")
    public Users usuario(@PathVariable Integer idUsuario){
        return userService.findOne(idUsuario);
    }
    //
    @PostMapping("/Usuarios/Autorizar/{idUsuario}")
    public void usuarioAutorizar(@PathVariable Integer idUsuario){
        Users users=userService.findOne(idUsuario);
        users.setActive(1);
        userService.save(users);
    }

}
