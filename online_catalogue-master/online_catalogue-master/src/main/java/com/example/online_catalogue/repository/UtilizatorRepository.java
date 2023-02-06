package com.example.online_catalogue.repository;

import com.example.online_catalogue.entity.User;
import com.example.online_catalogue.entity.Utilizator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilizatorRepository extends JpaRepository<Utilizator, String> {
}
