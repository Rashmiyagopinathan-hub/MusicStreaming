package com.musicstreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicstreaming.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}