package com.empleos.empleos3.model.dao;

import com.empleos.empleos3.model.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface IRolesDao extends CrudRepository<Role,Integer> {
}
