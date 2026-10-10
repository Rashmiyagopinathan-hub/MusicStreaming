package com.musicstreaming.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.musicstreaming.model.Song;
import com.musicstreaming.service.SongService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService service;

    public SongController(SongService service) {
        this.service = service;
    }

    @PostMapping
    public Song addSong(@RequestBody Song song) {
        return service.saveSong(song);
    }

    @GetMapping
    public List<Song> getSongs() {
        return service.getAllSongs();
    }
}