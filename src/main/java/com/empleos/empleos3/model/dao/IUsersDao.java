package com.empleos.empleos3.model.dao;



import com.empleos.empleos3.model.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface IUsersDao extends CrudRepository<Users,Integer> {
    Users findByEmail(String name);
}
