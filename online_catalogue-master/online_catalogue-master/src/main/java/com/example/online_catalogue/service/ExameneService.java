package com.example.online_catalogue.service;

import com.example.online_catalogue.entity.Examene;
import com.example.online_catalogue.repository.ExameneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExameneService {

    @Autowired
    ExameneRepository exameneRepository;

    public List<Examene> getExamene(){
        return exameneRepository.findAll();
    }

    public void saveExameneToDatabase(Examene examene) {
        exameneRepository.save(examene);
    }

    public Examene getExameneById(Integer id){
        return exameneRepository.getById(id);
    }

}
