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
    public User updateUser(Long id, User user) {
        return Database.users.stream()
                .filter(user1 -> user1.getId().equals(id))
                .findFirst()
                .map(user1 -> {
                    user1.setName(user.getName());
                    user1.setAge(user.getAge());
                    return user1;
                })
                .orElse(null);
    }

    @Override
    public String deleteUser(Long id) {
        boolean isDeleted = Database.users.removeIf(user -> user.getId().equals(id));
        return isDeleted ? "successfully deleted" : "failed";
    }
}
