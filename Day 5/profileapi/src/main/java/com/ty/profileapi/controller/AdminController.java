package com.ty.profileapi.controller;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.profileapi.dto.UserDto;
import com.ty.profileapi.entity.Users;
import com.ty.profileapi.repo.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final UserRepository userRepository;

    
    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userRepository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());

        return ResponseEntity.ok(users);
    }

    
    private UserDto convertToDto(Users user) {
        Set<String> roles = user.getRole()
                .stream()
                .map(Enum::name) 
                .collect(Collectors.toSet());

        return new UserDto(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getFullName(),
                roles
        );
    }
}


