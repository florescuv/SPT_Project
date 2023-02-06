package com.example.online_catalogue.repository;

import com.example.online_catalogue.entity.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer>{
}
