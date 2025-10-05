package com.ty.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hello.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer>{
    
}
