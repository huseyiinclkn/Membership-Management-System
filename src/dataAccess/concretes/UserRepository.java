package dataAccess.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserRepository implements UserDao {

    private UserService userService;

    public UserRepository(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void add(User user) {
        userService.nameControl(user);
        userService.emailControl(user);
        userService.passwordControl(user);

        System.out.println("Üyeliğiniz eklendi...");

    }


}
