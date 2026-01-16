package com.example.loginapp.service;

import com.example.loginapp.model.User;
import com.example.loginapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(String username, String password, String email) {
        if (userRepository.findByUsername(username).isPresent()) {
            return null; // User already exists
        }
        User user = new User(username, password, email);
        return userRepository.save(user);
    }

    public User authenticate(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user.get();
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
