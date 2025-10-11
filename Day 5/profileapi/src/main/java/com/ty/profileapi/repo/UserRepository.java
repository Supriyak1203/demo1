package com.ty.profileapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.profileapi.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
    boolean existsByUsername(String username);
}

