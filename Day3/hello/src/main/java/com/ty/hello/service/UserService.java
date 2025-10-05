package com.ty.hello.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ty.hello.entity.User;
import com.ty.hello.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> findAllUsers() {
        return repository.findAll();
    }

    public User findUserById(int id) {
        return repository.findById(id).orElse(null);
    }

    public boolean deleteUser(int id) {
        Optional<User> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return true;
        }
        return false;
    }
}
