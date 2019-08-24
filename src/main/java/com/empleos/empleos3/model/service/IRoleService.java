package com.empleos.empleos3.model.service;



import com.empleos.empleos3.model.entity.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();
    Role findOne(Integer id);
}
