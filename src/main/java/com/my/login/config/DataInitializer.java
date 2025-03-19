package com.my.login.config;


import com.my.login.entity.User;
import com.my.login.factory.UserFactory;
import com.my.login.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, PasswordEncoder passwordEncoder) {

        return args -> {

            if (userRepository.findByUsername("admin").isEmpty()) {

                /*
                User admin = new User();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin123"));
                admin.setRole("ADMIN");

                 */

                //Applying Factory Pattern
                User admin = UserFactory.createUser("admin", "admin123", "ADMIN", passwordEncoder);

                userRepository.save(admin);
                System.out.println("Admin user created!");
            }

            if (userRepository.findByUsername("user").isEmpty()) {

              /*
                User user = new User();
                user.setUsername("user");
                user.setPassword(passwordEncoder.encode("user123"));
                user.setRole("USER");

               */

                //Applying Factory Pattern
                User user = UserFactory.createUser("user", "user123", "USER", passwordEncoder);

                userRepository.save(user);
                System.out.println("User account created!");
            }
        };
    }
}
