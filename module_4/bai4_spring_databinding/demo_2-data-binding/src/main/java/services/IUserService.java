package services;

import models.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();
    void saveUser(User user);
    void deleteUser(int id);
    void editUser(User user);
}
