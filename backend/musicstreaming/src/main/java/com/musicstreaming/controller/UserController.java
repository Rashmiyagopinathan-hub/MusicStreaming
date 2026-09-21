package com.musicstreaming.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.musicstreaming.model.User;
import com.musicstreaming.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }
}