package com.musicstreaming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.musicstreaming.model.Album;
import com.musicstreaming.repository.AlbumRepository;

@Service
public class AlbumService {

    private final AlbumRepository repository;

    public AlbumService(AlbumRepository repository) {
        this.repository = repository;
    }

    public Album saveAlbum(Album album) {
        return repository.save(album);
    }

    public List<Album> getAllAlbums() {
        return repository.findAll();
    }
}