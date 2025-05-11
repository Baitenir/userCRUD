package service.impl;
import models.User;
import service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserService userService = new UserServiceImpl();
    @Override
    public String addUser(User user) {
        return userService.addUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public User updateUser(User user) {
        return userService.updateUser(user);
    }

    @Override
    public String deleteUser(Long id) {
        return userService.deleteUser(id);
    }
}
