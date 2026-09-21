package com.musicstreaming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.musicstreaming.model.Like;
import com.musicstreaming.repository.LikeRepository;

@Service
public class LikeService {

    private final LikeRepository repository;

    public LikeService(LikeRepository repository) {
        this.repository = repository;
    }

    public Like saveLike(Like like) {
        return repository.save(like);
    }

    public List<Like> getAllLikes() {
        return repository.findAll();
    }
}