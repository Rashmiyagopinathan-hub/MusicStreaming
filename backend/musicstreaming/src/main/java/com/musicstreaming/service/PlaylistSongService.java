package com.musicstreaming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.musicstreaming.model.PlaylistSong;
import com.musicstreaming.repository.PlaylistSongRepository;

@Service
public class PlaylistSongService {

    private final PlaylistSongRepository repository;

    public PlaylistSongService(PlaylistSongRepository repository) {
        this.repository = repository;
    }

    public PlaylistSong savePlaylistSong(PlaylistSong playlistSong) {
        return repository.save(playlistSong);
    }

    public List<PlaylistSong> getAllPlaylistSongs() {
        return repository.findAll();
    }
}