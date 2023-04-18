package com.litvishko.kata.springBootKataPP.repository;

import com.litvishko.kata.springBootKataPP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
