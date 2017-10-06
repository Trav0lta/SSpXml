package ua.com.owu.service;

/**
 * Created by User on 26.09.2017.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
