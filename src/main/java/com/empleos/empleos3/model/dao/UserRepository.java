package com.empleos.empleos3.model.dao;



import com.empleos.empleos3.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<Users,Integer> {
    Optional<Users> findByEmail(String email);
    Optional<Users> findByName(String name);
}
