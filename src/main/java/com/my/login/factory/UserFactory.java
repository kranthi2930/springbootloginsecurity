package com.my.login.factory;


/*
* Instead of manually setting properties,
*   use a factory method for creating User objects.
* */

import com.my.login.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserFactory {
    public static User createUser(String username, String password, String role, PasswordEncoder passwordEncoder) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password)); // Encrypting password
        user.setRole(role);
        return user;
    }
}
