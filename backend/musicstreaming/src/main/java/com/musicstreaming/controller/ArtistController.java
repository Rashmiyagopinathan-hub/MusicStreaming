package com.musicstreaming.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.musicstreaming.model.Artist;
import com.musicstreaming.service.ArtistService;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    private final ArtistService service;

    public ArtistController(ArtistService service) {
        this.service = service;
    }

    @PostMapping
    public Artist addArtist(@RequestBody Artist artist) {
        return service.saveArtist(artist);
    }

    @GetMapping
    public List<Artist> getArtists() {
        return service.getAllArtists();
    }
}