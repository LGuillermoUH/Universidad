package com.empleos.empleos3.model.entity;

import java.io.Serializable;
import java.util.Set;

public class 	JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private final Users users;

	public JwtResponse(String jwttoken, Users users) {
		this.jwttoken = jwttoken;

		this.users = users;
	}

	public int getId() {
		return users.getId();
	}
	public String getName(){
		return users.getName();
	}
	public String getEmail(){
		return users.getEmail();
	}
	public Empresa getEmpresa(){
		return users.getEmpresa();
	}
	public Campus getCampus(){
		return users.getCampus();
	}
	public Set<Role> getRole(){
		return users.getRoles();
	}
	public int getActive(){
		return users.getActive();
	}
	public String getToken() {
		return this.jwttoken;
	}
}