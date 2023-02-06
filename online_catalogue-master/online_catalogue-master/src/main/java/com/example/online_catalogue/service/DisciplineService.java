package com.example.online_catalogue.service;

import com.example.online_catalogue.entity.Discipline;
import com.example.online_catalogue.repository.DisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplineService {

    @Autowired
    DisciplineRepository disciplineRepository;

    public List<Discipline> getDiscipline(){
        return disciplineRepository.findAll();
    }

    public void saveDisciplineToDatabase(Discipline discipline) {
        disciplineRepository.save(discipline);
    }

    public Discipline getDisciplineById(Integer id){
        return disciplineRepository.getById(id);
    }
}
