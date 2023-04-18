package com.litvishko.kata.springBootKataPP.service;

import com.litvishko.kata.springBootKataPP.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> allUsers();
    void addUser(User user);
    void updateUser(User user, Long id);
    void deleteUser(Long id);
    User getUser(Long id);
}
