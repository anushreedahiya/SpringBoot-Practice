package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getUser(String email) {
    	return userRepository.findByEmail(email);
    }
    
    public Users addUser(Users users) {
    	return userRepository.save(users);
    }
}
