package com.example.online_catalogue.repository;

import com.example.online_catalogue.entity.Examene;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ExameneRepository extends JpaRepository<Examene, Integer>{

}
