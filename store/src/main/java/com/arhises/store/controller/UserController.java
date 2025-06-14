package com.arhises.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // This class will handle user-related requests
    // For example, user registration, login, profile management, etc.

    // Add methods to handle user operations here
    // e.g., @GetMapping("/profile"), @PostMapping("/register"), etc.

    // Example method for user registration
    @PostMapping("/register")
    public String registerUser() {
        // Logic for user registration
        return "User registered successfully!"; // Return view name or redirect
    }
}
