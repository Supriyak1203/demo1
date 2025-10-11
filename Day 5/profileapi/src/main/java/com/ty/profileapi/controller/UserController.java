package com.ty.profileapi.controller;


import java.security.Principal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.profileapi.dto.UserDto;
import com.ty.profileapi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) { this.userService = userService; }

    @GetMapping("/profile")
    public ResponseEntity<UserDto> getProfile(Principal principal) {
        return ResponseEntity.ok(userService.getByUsername(principal.getName()));
    }

}
