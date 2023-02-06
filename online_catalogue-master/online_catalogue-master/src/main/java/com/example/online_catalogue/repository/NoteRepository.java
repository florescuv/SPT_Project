package com.example.online_catalogue.repository;

import com.example.online_catalogue.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    @Modifying
    @Query("delete from Note where Id=:id")
    int deleteNotaById(Integer id);
}
