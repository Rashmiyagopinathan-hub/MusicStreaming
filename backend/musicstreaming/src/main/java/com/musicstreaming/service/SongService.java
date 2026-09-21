package com.musicstreaming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.musicstreaming.model.Song;
import com.musicstreaming.repository.SongRepository;

@Service
public class SongService {

    private final SongRepository repository;

    public SongService(SongRepository repository) {
        this.repository = repository;
    }

    public Song saveSong(Song song) {
        return repository.save(song);
    }

    public List<Song> getAllSongs() {
        return repository.findAll();
    }
}