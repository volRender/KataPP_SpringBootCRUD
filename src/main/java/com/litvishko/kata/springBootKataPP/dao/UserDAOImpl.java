package com.litvishko.kata.springBootKataPP.dao;

import com.litvishko.kata.springBootKataPP.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext(type= PersistenceContextType.EXTENDED)
    private EntityManager em;

    @Override
    public List<User> allUsers() {
        TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
        return query.getResultList();
    }

    @Override
    public void addUser(User user) {
        em.persist(user);
        System.out.println("User with name: " + user.getFirstName() + " was added in db");
    }

    @Override
    public User getUser(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void updateUser(User user, Long id) {
        em.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
        em.remove(getUser(id));
    }

}
