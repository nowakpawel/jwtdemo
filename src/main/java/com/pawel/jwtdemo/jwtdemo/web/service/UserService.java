package com.pawel.jwtdemo.jwtdemo.web.service;

import com.pawel.jwtdemo.jwtdemo.web.model.User;
import com.pawel.jwtdemo.jwtdemo.web.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
