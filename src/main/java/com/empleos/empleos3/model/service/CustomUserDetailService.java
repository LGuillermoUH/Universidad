package com.empleos.empleos3.model.service;


import com.empleos.empleos3.model.dao.UserRepository;
import com.empleos.empleos3.model.entity.CustomUserDetails;
import com.empleos.empleos3.model.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Users> optionalUsers=userRepository.findByEmail(email);
        optionalUsers.orElseThrow(()-> new UsernameNotFoundException("Username not foud"));
        return  optionalUsers
                .map(CustomUserDetails::new).get();

    }
    public UserDetails loadUserByUsername2(String id) throws UsernameNotFoundException {
        Optional<Users> optionalUsers=userRepository.findByName(id);
        optionalUsers.orElseThrow(()-> new UsernameNotFoundException("Username not foud"));
        return  optionalUsers
                .map(CustomUserDetails::new).get();

    }
}
