package org.guviprojectocf.community_forum.controller;

import org.guviprojectocf.community_forum.model.User;
import org.guviprojectocf.community_forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser (@RequestBody User user) {
        return userService.createUser (user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser ById(@PathVariable Long id) {
        return userService.getUser ById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser (@PathVariable Long id) {
        userService.deleteUser (id);
        return ResponseEntity.noContent().build();
    }
}