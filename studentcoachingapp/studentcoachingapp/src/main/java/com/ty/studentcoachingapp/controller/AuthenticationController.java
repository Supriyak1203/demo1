package com.ty.studentcoachingapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ty.studentcoachingapp.dto.AuthResponseDto;
import com.ty.studentcoachingapp.dto.LoginUserDto;
import com.ty.studentcoachingapp.dto.RegisterUserDto;
import com.ty.studentcoachingapp.dto.ResetPasswordDto;
import com.ty.studentcoachingapp.entity.User;
import com.ty.studentcoachingapp.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto) {
        User registeredUser = authenticationService.signup(registerUserDto);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthResponseDto> authenticate(@RequestBody LoginUserDto loginUserDto) {
        AuthResponseDto response = authenticationService.authenticate(loginUserDto);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/resetpassword")
    public ResponseEntity<User> resetPassword(@RequestBody ResetPasswordDto resetPasswordDto) {
        User updatedUser = authenticationService.reset(resetPasswordDto);
        return ResponseEntity.ok(updatedUser);
    }
}
