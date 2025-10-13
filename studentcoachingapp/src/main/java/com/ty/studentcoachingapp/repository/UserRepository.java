package com.ty.studentcoachingapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.studentcoachingapp.entity.User;

public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findByEmail(String email);
    
}
