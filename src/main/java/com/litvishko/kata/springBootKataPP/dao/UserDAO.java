package com.litvishko.kata.springBootKataPP.dao;

import com.litvishko.kata.springBootKataPP.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    void addUser(User user);
    void updateUser(User user, Long id);
    void deleteUser(Long id);
    User getUser(Long id);
}
