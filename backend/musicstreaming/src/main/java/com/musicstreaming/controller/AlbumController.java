package com.musicstreaming.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.musicstreaming.model.Album;
import com.musicstreaming.service.AlbumService;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final AlbumService service;

    public AlbumController(AlbumService service) {
        this.service = service;
    }

    @PostMapping
    public Album addAlbum(@RequestBody Album album) {
        return service.saveAlbum(album);
    }

    @GetMapping
    public List<Album> getAlbums() {
        return service.getAllAlbums();
    }
}