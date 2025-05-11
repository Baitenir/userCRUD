package dao.impl;
import dao.UserDao;
import models.User;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public String addUser(User user) {
        return "";
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public String deleteUser(Long id) {
        return "";
    }
}
