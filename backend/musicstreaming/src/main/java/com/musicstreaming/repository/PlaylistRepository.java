package com.musicstreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicstreaming.model.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}