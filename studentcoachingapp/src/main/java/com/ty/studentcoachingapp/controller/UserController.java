package com.ty.studentcoachingapp.controller;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.studentcoachingapp.entity.User;
import com.ty.studentcoachingapp.service.UserService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/signup")
    public String register(@RequestBody User user) {
        userService.register(user);
        return "User Registered Successfully!";
    }

    
    @PostMapping("/signin")
    public String login(@RequestBody Map<String, String> data) {
        String email = data.get("email");
        String password = data.get("password");

        String result = userService.login(email, password);

        if (result.startsWith("Login successful")) {
            if (result.contains("A")) {
                return "Admin Login Successful!";
            } else if (result.contains("U")) {
                return "User Login Successful!";
            }
        }

        return result;
    }


    @PutMapping("/resetpassword")
    public String resetPassword(@RequestBody Map<String, String> data) {
        boolean result = userService.resetPassword(data.get("email"), data.get("newPassword"));
        return result ? "Password Reset Successfully!" : "Email Not Found!";
    }
}
