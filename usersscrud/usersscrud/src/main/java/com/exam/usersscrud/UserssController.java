package com.exam.usersscrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserssController {

    @Autowired
    private UserssService userssService;

    // Create a new user
    @PostMapping
    public Userss createUser(@RequestBody Userss user) {
        return userssService.saveUser(user);
    }

    // Get all users
    @GetMapping
    public List<Userss> getAllUsers() {
        return userssService.getAllUsers();
    }

    // Get a user by id
    @GetMapping("/{id}")
    public Optional<Userss> getUserById(@PathVariable Long id) {
        return userssService.getUserById(id);
    }

    // Update a user
    @PutMapping("/{id}")
    public Userss updateUser(@PathVariable Long id, @RequestBody Userss user) {
        user.setId(id);
        return userssService.saveUser(user);
    }

    // Delete a user
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userssService.deleteUser(id);
        return "User deleted with id " + id;
    }
}
