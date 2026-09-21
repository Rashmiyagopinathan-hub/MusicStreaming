package com.musicstreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicstreaming.model.PlaylistSong;

public interface PlaylistSongRepository extends JpaRepository<PlaylistSong, Long> {
}