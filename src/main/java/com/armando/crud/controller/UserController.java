package com.armando.crud.controller;

import com.armando.crud.entity.User;
import com.armando.crud.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User save(User user) {
        return userService.save(user);
    }
}
