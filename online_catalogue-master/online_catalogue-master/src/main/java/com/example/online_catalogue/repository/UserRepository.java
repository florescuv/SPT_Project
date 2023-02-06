package com.example.online_catalogue.repository;

import com.example.online_catalogue.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    //@Query("select * from studenti where username = ?1")
    //List<User> findUserByUsername(String name);
}
