package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.entity.Role;

/**
 * Created by User on 26.09.2017.
 */
public interface RoleDAO extends JpaRepository<Role, Integer> {


}
