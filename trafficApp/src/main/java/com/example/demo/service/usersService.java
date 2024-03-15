package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.users;
import com.example.demo.repo.usersRepo;

@Service
public class usersService {

    @Autowired
    private usersRepo repo;

    public users addsignup(users s) {
        return repo.save(s);
    }

    
    public users login(String username, String password) {
        users user = repo.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            return null;
        }
    }
}
