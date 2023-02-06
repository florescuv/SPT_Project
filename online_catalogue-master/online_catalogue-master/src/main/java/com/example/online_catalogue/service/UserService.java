package com.example.online_catalogue.service;

import com.example.online_catalogue.entity.User;
import com.example.online_catalogue.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository rep;

    public List<User> getUsers(){
        return rep.findAll();
    }

    public void saveUser(User user){
        rep.save(user);
    }

    public User getUserByUsername(String username){
        List<User> stud = rep.findAll();
        for(var q : stud){
            if(q.getUtilizator().getUsername().equals(username)){
                return q;
            }
        }
        return null;
    }

    /*
    @Transactional
    public List<User> getUserByUsername(String name){
        return rep.findUserByUsername(name);
    }

     */
}
