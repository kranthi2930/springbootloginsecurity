package com.my.login.repository;

import com.my.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<com.my.login.entity.User, Long> {
    Optional<User> findByUsername(String username);
}
