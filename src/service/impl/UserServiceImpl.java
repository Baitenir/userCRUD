package service.impl;
import dao.UserDao;
import dao.impl.UserDaoImpl;
import models.User;
import service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public String addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User updateUser(Long id, User user) {
        return userDao.updateUser(id, user);
    }

    @Override
    public String deleteUser(Long id) {
        return userDao.deleteUser(id);
    }
}
