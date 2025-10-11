package com.ty.profileapi.dto;

import java.util.Set;

public record AdminDto(
        Long id,
        String username,
        String email,
        Set<String> roles
) {}
