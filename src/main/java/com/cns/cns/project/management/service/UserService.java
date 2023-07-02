package com.cns.cns.project.management.service;

import com.cns.cns.project.management.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> fetchUserList();
}
