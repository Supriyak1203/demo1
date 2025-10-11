package com.ty.profileapi.service;

import java.util.Set;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ty.profileapi.dto.AuthResponse;
import com.ty.profileapi.dto.Signin;
import com.ty.profileapi.dto.Signup;
import com.ty.profileapi.entity.Role;
import com.ty.profileapi.entity.Users;
import com.ty.profileapi.repo.UserRepository;
import com.ty.profileapi.security.JwtProvider;

@Service
public class AuthService {
    private final UserRepository userRepo;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authManager;
    private final JwtProvider jwtProvider;

    public AuthService(UserRepository userRepo, PasswordEncoder passwordEncoder,
                       AuthenticationManager authManager, JwtProvider jwtProvider) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
        this.authManager = authManager;
        this.jwtProvider = jwtProvider;
    }

    public void signup(Signup req) {
        if (userRepo.existsByUsername(req.username))
            throw new RuntimeException("Username already exists");
        Users user = Users.builder()
                .username(req.username)
                .password(passwordEncoder.encode(req.password))
                .email(req.email)
                .fullName(req.fullName)
                .role(Set.of(Role.ROLE_USER))
                .build();
        userRepo.save(user);
    }

    public AuthResponse signin(Signin req) {
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(req.username, req.password));
        String token = jwtProvider.generateToken(req.username);
        return new AuthResponse(token, "Bearer", 900000);
    }
}

