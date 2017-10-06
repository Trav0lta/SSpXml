package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.ProfileDAO;
import ua.com.owu.entity.Profile;
import ua.com.owu.service.ProfileService;

import java.util.List;

@Service
@Transactional
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    ProfileDAO profileDAO;
    @Override
    public void save(Profile profile) {
        profileDAO.save(profile);
    }

    @Override
    public List<Profile> findAll() {
        return profileDAO.findAll();
    }

    @Override
    public Profile findByInterest(String interest) {
        return profileDAO.findByProfileInterest(interest);
    }
}
