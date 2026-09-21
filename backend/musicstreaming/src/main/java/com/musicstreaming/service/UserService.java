package com.musicstreaming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.musicstreaming.model.User;
import com.musicstreaming.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }
}