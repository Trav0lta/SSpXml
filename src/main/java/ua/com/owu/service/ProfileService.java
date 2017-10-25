package ua.com.owu.service;

import ua.com.owu.entity.Profile;

import java.util.List;

/**
 * Created by User on 24.09.2017.
 */
public interface ProfileService {
    void save(Profile profile);
    Profile findByInterest(String interest);
    List<Profile> findAll();

}
