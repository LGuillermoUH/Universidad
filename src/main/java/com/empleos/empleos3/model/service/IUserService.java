package com.empleos.empleos3.model.service;


import com.empleos.empleos3.model.entity.Users;

import java.util.List;

public interface IUserService {
     List<Users> findAll();
     void save(Users users);
     Users findOne(Integer id);
     void delete(Integer id);
}
