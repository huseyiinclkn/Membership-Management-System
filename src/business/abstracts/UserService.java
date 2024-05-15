package business.abstracts;

import entities.concretes.User;

public interface UserService  {
    void nameControl(User user);
    void passwordControl(User user);
    void emailControl(User user);

}
