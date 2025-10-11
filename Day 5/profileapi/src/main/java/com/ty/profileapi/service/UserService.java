package com.ty.profileapi.service;
import org.springframework.stereotype.Service;

import com.ty.profileapi.dto.UpdateUserDto;
import com.ty.profileapi.dto.UserDto;
import com.ty.profileapi.entity.Users;

@Service
public class UserService {
    private final com.ty.profileapi.repo.UserRepository userRepo;

    public UserService(com.ty.profileapi.repo.UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public UserDto getByUsername(String username) {
        Users u = userRepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return new UserDto(u.getId(), u.getUsername(), u.getEmail(), u.getFullName(),
                u.getRole().stream().map(Enum::name).collect(java.util.stream.Collectors.toSet()));
    }

    public UserDto updateProfile(String username, UpdateUserDto dto) {
        Users u = userRepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        u.setEmail(dto.email);
        u.setFullName(dto.fullName);
        userRepo.save(u);
        return getByUsername(username);
    }
}
