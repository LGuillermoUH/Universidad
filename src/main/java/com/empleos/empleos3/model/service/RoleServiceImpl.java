package com.empleos.empleos3.model.service;

import com.empleos.empleos3.model.dao.IRolesDao;
import com.empleos.empleos3.model.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    public IRolesDao rolesDao;

    @Override
    @Transactional(readOnly = true)
    public List<Role> findAll() {
        return (List<Role>) rolesDao.findAll();
    }


    @Override
    @Transactional
    public Role findOne(Integer id) {
        return rolesDao.findById(id).orElse(null);
    }


}
