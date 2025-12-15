package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // GET all users
    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/by-email")
    public ResponseEntity<Users> getUserByEmail(@RequestParam String email) {
        Users user = userService.getUser(email);
        if (user == null) {
            return ResponseEntity.notFound().build(); // returns 404
        }
        return ResponseEntity.ok(user);
    }

    // POST new user
    @PostMapping
    public Users addUser(@RequestBody Users user) {
        return userService.addUser(user);
    }
}
