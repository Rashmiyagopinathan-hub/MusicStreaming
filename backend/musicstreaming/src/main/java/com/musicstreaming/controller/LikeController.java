package com.musicstreaming.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.musicstreaming.model.Like;
import com.musicstreaming.service.LikeService;

@RestController
@RequestMapping("/likes")
public class LikeController {

    private final LikeService service;

    public LikeController(LikeService service) {
        this.service = service;
    }

    @PostMapping
    public Like addLike(@RequestBody Like like) {
        return service.saveLike(like);
    }

    @GetMapping
    public List<Like> getLikes() {
        return service.getAllLikes();
    }
}