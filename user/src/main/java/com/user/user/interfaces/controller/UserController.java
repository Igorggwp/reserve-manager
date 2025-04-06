package com.user.user.interfaces.controller;

import com.user.user.domain.model.User;
import com.user.user.application.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> list() {
        return service.list();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return service.save(user);
    }
}
