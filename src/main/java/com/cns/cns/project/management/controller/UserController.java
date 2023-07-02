package com.cns.cns.project.management.controller;

import com.cns.cns.project.management.entity.User;
import com.cns.cns.project.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/user")
    public List<User> fetchUserList() {
        return userService.fetchUserList();
    }
}
