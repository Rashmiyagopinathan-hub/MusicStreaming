package com.musicstreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicstreaming.model.Song;

public interface SongRepository extends JpaRepository<Song, Long> {
}