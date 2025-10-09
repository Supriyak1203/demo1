
package com.ty.securityexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.securityexample.entity.Users;
import com.ty.securityexample.service.JwtService;
import com.ty.securityexample.service.TokenService;
import com.ty.securityexample.service.UserService1;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService1 userService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/signup")
    public ResponseEntity<String> register(@RequestBody Users user) {
        userService.register(user);
        return ResponseEntity.ok("User registered successfully with role: " + user.getRole());
    }

    @PostMapping("/signin")
    public ResponseEntity<String> login(@RequestBody Users user) {
        String token = userService.verify(user);
        if (!token.equals("Fail")) {
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestHeader("Authorization") String authHeader) {
        String token = authHeader.replace("Bearer ", "");
        long expiry = jwtService.getJwtExpiry(token);
        tokenService.blacklistToken(token, expiry);
        return ResponseEntity.ok("Logged out successfully");
    }
}
