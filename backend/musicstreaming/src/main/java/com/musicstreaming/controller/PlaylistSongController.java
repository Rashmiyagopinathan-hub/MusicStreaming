package com.musicstreaming.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.musicstreaming.model.PlaylistSong;
import com.musicstreaming.service.PlaylistSongService;

@RestController
@RequestMapping("/playlist-songs")
public class PlaylistSongController {

    private final PlaylistSongService service;

    public PlaylistSongController(PlaylistSongService service) {
        this.service = service;
    }

    @PostMapping
    public PlaylistSong addPlaylistSong(@RequestBody PlaylistSong playlistSong) {
        return service.savePlaylistSong(playlistSong);
    }

    @GetMapping
    public List<PlaylistSong> getPlaylistSongs() {
        return service.getAllPlaylistSongs();
    }
}