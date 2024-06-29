package com.example.flyway_db_migration.repositories;

import com.example.flyway_db_migration.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
