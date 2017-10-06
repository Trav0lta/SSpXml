package ua.com.owu.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.RoleDAO;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.Role;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private RoleDAO roleDAO;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
//    @Autowired
//    SessionFactory factory;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword())); //encoding coda
        Set<Role> roles = new HashSet<>();  //при збереженні присвоюємо юзеру роль
        roles.add(roleDAO.getOne(1));    //по замовчуванні роль юзера є з id 1, тобто user
        user.setRoles(roles);               //встановили цю роль
        userDAO.save(user);                 //зберегли юзера
    }
    @Override
    public User findByUsername(String username) {
        return userDAO.findByUsername(username);    //получаємо юзара з бази по його імені
    }

//    @Override
//    public int delete(int id) {
//        Session session = factory.openSession();
//        User user = (User) session.get(User.class, id);
//        session.delete(user);
//        Serializable identifier = session.getIdentifier(user);
//        session.flush();
//        session.close();
//        return (Integer) identifier;
//    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
