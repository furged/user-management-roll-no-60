package com.exam.usersscrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserssService {

    @Autowired
    private UserssRepository userssRepository;

    // Create or Update user
    public Userss saveUser(Userss user) {
        return userssRepository.save(user);
    }

    // Get all users
    public List<Userss> getAllUsers() {
        return userssRepository.findAll();
    }

    // Get user by id
    public Optional<Userss> getUserById(Long id) {
        return userssRepository.findById(id);
    }

    // Delete user by id
    public void deleteUser(Long id) {
        userssRepository.deleteById(id);
    }
}
