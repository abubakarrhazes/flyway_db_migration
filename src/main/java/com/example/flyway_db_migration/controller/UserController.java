package com.example.flyway_db_migration.controller;


import com.example.flyway_db_migration.domain.User;
import com.example.flyway_db_migration.dto.UserDto;
import com.example.flyway_db_migration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get-users")
    public List<User> getAllUsers(){
        return userService.gerAllUser();
    }

    @GetMapping("/test")
    public String testRoute(){
        return "Working Fine You are Good To Go Vamos";
    }


    @PostMapping("/add-user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);

    }



}
