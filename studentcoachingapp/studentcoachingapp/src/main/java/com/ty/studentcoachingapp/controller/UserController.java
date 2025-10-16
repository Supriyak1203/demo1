package com.ty.studentcoachingapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.studentcoachingapp.entity.User;
import com.ty.studentcoachingapp.service.UserService;


@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public ResponseEntity<User> authenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Object principal = authentication.getPrincipal();

        if (principal instanceof User) {
            return ResponseEntity.ok((User) principal);
        } else {
            String email = authentication.getName();
            User user = userService.findByEmail(email);
            return ResponseEntity.ok(user);
        }
    }

   @GetMapping("/")
public ResponseEntity<List<User>> getAllUsers() {
    List<User> users = userService.getAllUsers(); // corrected method name
    return ResponseEntity.ok(users);
}
}
