package com.example.flyway_db_migration.dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private String userName;

    private  String email;


    private String firstName;


    private String lastName;
    private  String otherName;


}
