package com.cns.cns.project.management.service;

import com.cns.cns.project.management.entity.User;
import com.cns.cns.project.management.error.UserNotFoundException;
import com.cns.cns.project.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchUserList() {
        return userRepository.findAll();
    }

    @Override
    public User fetchUserById(Long userId) throws UserNotFoundException {
        Optional<User> user = userRepository.findById(userId);
        if(!user.isPresent()) {
            throw new UserNotFoundException("User Not Available");
        }
        return user.get();
    }

    @Override
    public User fetchUserByEmail(String email) throws UserNotFoundException{
        return userRepository.findByEmail(email);
    }

    @Override
    public User fetchUserByFirstName(String firstName) throws UserNotFoundException {
        return userRepository.findByFirstNameIgnoreCase(firstName);
    }

    @Override
    public User fetchUserByLastName(String lastName) throws UserNotFoundException {
        return userRepository.findByLastNameIgnoreCase(lastName);
    }

    @Override
    public User fetchUserByFirstNameAndLastName(String firstName, String lastName) throws UserNotFoundException {
        return userRepository.findByFirstNameAndLastNameIgnoreCase(firstName, lastName);
    }

    @Override
    public User fetchUserByFirstNameIgnoreCase(String firstName) throws UserNotFoundException {
        return null;
    }
}
