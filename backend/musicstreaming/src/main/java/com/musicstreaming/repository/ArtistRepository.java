package com.musicstreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicstreaming.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}