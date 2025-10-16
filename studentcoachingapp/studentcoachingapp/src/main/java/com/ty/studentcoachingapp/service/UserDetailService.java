package com.ty.studentcoachingapp.service;

import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.*;

import com.ty.studentcoachingapp.entity.User;
import com.ty.studentcoachingapp.repo.UserRepo;

@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepo userRepo;

    public UserDetailService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + email));
        return user;
    }
}
