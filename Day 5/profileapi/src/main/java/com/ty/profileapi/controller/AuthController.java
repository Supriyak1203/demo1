package com.ty.profileapi.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.profileapi.dto.AuthResponse;
import com.ty.profileapi.dto.Signin;
import com.ty.profileapi.dto.Signup;
import com.ty.profileapi.security.JwtProvider;
import com.ty.profileapi.service.AuthService;
import com.ty.profileapi.service.TokenBlacklistService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;
    private final JwtProvider jwtProvider;
    private final TokenBlacklistService blacklistService;

    public AuthController(AuthService authService, JwtProvider jwtProvider, TokenBlacklistService blacklistService) {
        this.authService = authService;
        this.jwtProvider = jwtProvider;
        this.blacklistService = blacklistService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Signup req) {
        authService.signup(req);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered");
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthResponse> signin(@RequestBody Signin req) {
        return ResponseEntity.ok(authService.signin(req));
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        if (header != null && header.startsWith("Bearer ")) {
            String token = header.substring(7);
            var exp = jwtProvider.getExpiration(token);
            long ttl = (exp.getTime() - System.currentTimeMillis()) / 1000;
            blacklistService.blacklistToken(token, ttl);
        }
        return ResponseEntity.ok("Logged out");
    }
}



