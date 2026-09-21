package com.musicstreaming.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.musicstreaming.model.Playlist;
import com.musicstreaming.service.PlaylistService;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    private final PlaylistService service;

    public PlaylistController(PlaylistService service) {
        this.service = service;
    }

    @PostMapping
    public Playlist addPlaylist(@RequestBody Playlist playlist) {
        return service.savePlaylist(playlist);
    }

    @GetMapping
    public List<Playlist> getPlaylists() {
        return service.getAllPlaylists();
    }
}