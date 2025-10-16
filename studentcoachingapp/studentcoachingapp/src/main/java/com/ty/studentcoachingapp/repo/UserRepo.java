package com.ty.studentcoachingapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ty.studentcoachingapp.entity.User;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
