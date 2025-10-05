package com.ty.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hello.entity.User;
import com.ty.hello.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;


	
	@PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User returnedUser = service.saveUser(user);
        return new ResponseEntity<>(returnedUser, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User returnedUser = service.saveUser(user); // reused saveUser for update
        return ResponseEntity.ok(returnedUser);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> list = service.findAllUsers();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable int id) {
        User returnedUser = service.findUserById(id);
        if (returnedUser != null) {
            return ResponseEntity.ok(returnedUser);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        boolean deleted = service.deleteUser(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
