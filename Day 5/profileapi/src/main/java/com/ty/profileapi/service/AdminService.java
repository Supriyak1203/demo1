
package com.ty.profileapi.service;

import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ty.profileapi.dto.UserDto;
import com.ty.profileapi.repo.UserRepository;

@Service
public class AdminService {
    private final UserRepository repo;
    public AdminService(UserRepository repo) { this.repo = repo; }

    public Page<UserDto> getAllUsers(Pageable pageable) {
        return repo.findAll(pageable).map(u ->
                new UserDto(u.getId(), u.getUsername(), u.getEmail(), u.getFullName(),
                        u.getRole().stream().map(Enum::name).collect(Collectors.toSet())));
    }
}
