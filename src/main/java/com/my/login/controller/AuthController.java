package com.my.login.controller;


import com.my.login.dto.LoginRequest;
import com.my.login.dto.LoginResponse;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;

    public AuthController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest loginRequest, HttpServletResponse response) throws IOException {

        System.out.println("Login attempt for user: " + loginRequest.getUsername());

        Authentication authentication = authenticationManager.
                authenticate(new UsernamePasswordAuthenticationToken
                                (loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().
                setAuthentication(authentication);

        System.out.println("User authenticated, redirecting to home");

        // Redirect to home page after successful login
        response.sendRedirect("/home");
    }


}
