package it.team2.dao;

import it.team2.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.Optional;

public interface UserDao {

    void saveUser(User user);

    Optional<User> getUserById(long id);

}
