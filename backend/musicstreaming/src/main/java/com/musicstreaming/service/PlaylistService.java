package com.musicstreaming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.musicstreaming.model.Playlist;
import com.musicstreaming.repository.PlaylistRepository;

@Service
public class PlaylistService {

    private final PlaylistRepository repository;

    public PlaylistService(PlaylistRepository repository) {
        this.repository = repository;
    }

    public Playlist savePlaylist(Playlist playlist) {
        return repository.save(playlist);
    }

    public List<Playlist> getAllPlaylists() {
        return repository.findAll();
    }
}