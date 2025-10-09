
package com.ty.securityexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.securityexample.entity.Users;
import com.ty.securityexample.service.UserService1;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService1 userService;

    @PostMapping("/auth/register")
    public String register(@RequestBody Users user) {
        userService.register(user);
        return "User registered successfully with role: " + user.getRole();
    }

    @PostMapping("/auth/login")
    public String login(@RequestBody Users user) {
        return userService.verify(user);
    }

    @GetMapping("/user/all")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/admin/user/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return userService.getAllUsers()
                .stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
