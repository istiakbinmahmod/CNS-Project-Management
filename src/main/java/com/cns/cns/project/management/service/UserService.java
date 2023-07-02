package com.cns.cns.project.management.service;

import com.cns.cns.project.management.entity.User;
import com.cns.cns.project.management.error.UserNotFoundException;

import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public List<User> fetchUserList();

    public User fetchUserById(Long userId) throws UserNotFoundException;

    public User fetchUserByEmail(String email) throws UserNotFoundException;

    public User fetchUserByFirstName(String firstName) throws UserNotFoundException;

    public User fetchUserByLastName(String lastName) throws UserNotFoundException;

    public User fetchUserByFirstNameAndLastName(String firstName, String lastName) throws UserNotFoundException;

    public User fetchUserByFirstNameIgnoreCase(String firstName) throws UserNotFoundException;
}
