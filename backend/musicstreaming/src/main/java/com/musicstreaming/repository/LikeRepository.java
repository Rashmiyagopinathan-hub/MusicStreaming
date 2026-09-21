package com.musicstreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicstreaming.model.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {
}