package com.my.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {


    @GetMapping("/")
    public String defaultPage() {
        return "login"; // Loads /WEB-INF/views/login.jsp
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Loads /WEB-INF/views/login.jsp
    }

    @GetMapping("/home")
    public String homePage() {
        return "home"; // Loads /WEB-INF/views/home.jsp
    }
}
