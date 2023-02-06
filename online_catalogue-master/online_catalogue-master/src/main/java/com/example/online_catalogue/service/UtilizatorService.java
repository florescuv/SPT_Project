package com.example.online_catalogue.service;

import com.example.online_catalogue.entity.Utilizator;
import com.example.online_catalogue.repository.UtilizatorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UtilizatorService {

    @Autowired
    UtilizatorRepository rep;

    public List<Utilizator> getUtilizatori(){
        return rep.findAll();
    }

    public void saveUtilizator(Utilizator utilizator){
        rep.save(utilizator);
    }
}
