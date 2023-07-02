package com.cns.cns.project.management.controller;

import com.cns.cns.project.management.entity.User;
import com.cns.cns.project.management.error.UserNotFoundException;
import com.cns.cns.project.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@Valid @RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/user")
    public List<User> fetchUserList() {
        return userService.fetchUserList();
    }

    @GetMapping("/user/{id}")
    public User fetchUserById(@PathVariable("id") Long userId)
            throws UserNotFoundException {
        return userService.fetchUserById(userId);
    }
}
