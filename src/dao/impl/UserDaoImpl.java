package dao.impl;
import dao.UserDao;
import db.Database;
import models.User;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public String addUser(User user) {
        Database.users.add(user);
        return "successfully added";
    }
    @Override
    public User getUserById(Long id) {
        return Database.users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    @Override
    public List<User> getAllUsers() {
        return Database.users;
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
