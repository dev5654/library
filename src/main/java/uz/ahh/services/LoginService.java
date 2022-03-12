package uz.ahh.services;

import org.springframework.stereotype.Service;
import uz.ahh.dao.AuthLoginDao;
import uz.ahh.models.AuthLogin;

import java.util.List;

/**
 * Author : Qozoqboyev Ixtiyor
 * Time : 06.03.2022 11:30
 * Project : Spring_mvc_book_crud_my_version
 */
@Service
public class LoginService {

    private final AuthLoginDao authUserDao;

    public LoginService(AuthLoginDao authUserDao) {
        this.authUserDao = authUserDao;
    }

    public List<AuthLogin> getAll() {
        return authUserDao.getAll();
    }

    public Boolean checkUser(AuthLogin login) {
        List<AuthLogin> users = getAll();
        for (AuthLogin user : users) {
            if(user.getUsername().equals(login.getUsername())&&user.getPassword().equals(login.getPassword())
            &&user.getRole().equals("ADMIN")){
                return true;
            }
        }
        return false;
    }
}
