package com.my.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {


    @GetMapping("/")
    public String defaultPage() {
        return "redirect:/login"; // Redirects to /login
    }

    @GetMapping("/login")
    public String loginPage() {
        System.out.println("✅ /login mapping called, returning 'login.jsp'"); // Debugging
        return "login"; // Resolves to /WEB-INF/views/login.jsp
    }

    @GetMapping("/home")
    public String homePage() {
        return "home"; // Resolves to /WEB-INF/views/home.jsp
    }
}
