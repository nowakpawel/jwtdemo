package com.pawel.jwtdemo.jwtdemo.web.controller;


import com.pawel.jwtdemo.jwtdemo.web.model.User;
import com.pawel.jwtdemo.jwtdemo.web.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user/v1")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> hello () {
        List<User> allUsers = userService.findAllUsers();

        return ResponseEntity.ok().body(allUsers);
    }

    @PostMapping("/newUser")
    public ResponseEntity<User> createUser(@RequestBody @Validated User user) { //use DTO
        User created = userService.create(user);

        return ResponseEntity.ok(created);
    }

}
