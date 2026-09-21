package com.musicstreaming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.musicstreaming.model.Artist;
import com.musicstreaming.repository.ArtistRepository;

@Service
public class ArtistService {

    private final ArtistRepository repository;

    public ArtistService(ArtistRepository repository) {
        this.repository = repository;
    }

    public Artist saveArtist(Artist artist) {
        return repository.save(artist);
    }

    public List<Artist> getAllArtists() {
        return repository.findAll();
    }
}