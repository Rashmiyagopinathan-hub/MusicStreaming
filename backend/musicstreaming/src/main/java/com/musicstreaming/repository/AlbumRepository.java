package com.musicstreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicstreaming.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}