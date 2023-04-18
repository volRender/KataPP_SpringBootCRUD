package com.litvishko.kata.springBootKataPP.service;

import com.litvishko.kata.springBootKataPP.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> allUsers();
    void addOrUpdateUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);
}
