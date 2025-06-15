package com.arhises.store.controller;

import com.arhises.store.entity.User;
import com.arhises.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // Example method for user registration
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        if (user == null) {
            return "User data is required!";
        }
        userService.createUser(user);
        return "User registered successfully!\n" +
                user.toString(); // Return view name or redirect


    }

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            return "User not found!";
        }
        return user.toString(); // Return user data or view
    }
}
