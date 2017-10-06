package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.entity.User;

import java.util.List;

/**
 * Created by User on 26.09.2017.
 */
public interface UserDAO extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    List<User> findAll();
    //int delete(int id);
}
