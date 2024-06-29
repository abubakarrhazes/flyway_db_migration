package com.example.flyway_db_migration.service;


import com.example.flyway_db_migration.domain.User;
import com.example.flyway_db_migration.dto.UserDto;
import com.example.flyway_db_migration.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> gerAllUser(){
        return userRepository.findAll();
    }

    public User addUser(User user){
        return  userRepository.save(user);
    }
}
