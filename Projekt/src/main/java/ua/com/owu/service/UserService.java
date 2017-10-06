package ua.com.owu.service;

import ua.com.owu.entity.User;

import java.util.List;

/**
 * Service class for {@User}
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
    List<User> findAll();


    //int delete(int id);

}
