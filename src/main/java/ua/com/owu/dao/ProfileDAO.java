package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.owu.entity.Profile;
import ua.com.owu.entity.User;

import java.util.List;

public interface ProfileDAO extends JpaRepository<Profile,Integer> {
    @Query("from Profile p where p.interest=:interest")
    Profile findByProfileInterest(@Param("interest") String interest);

    List<Profile> findAll();


}
