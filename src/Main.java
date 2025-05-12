import dao.UserDao;
import dao.impl.UserDaoImpl;
import db.AcceptUserInfo;
import enums.Gender;
import models.User;
import service.UserService;
import service.impl.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDao userDao = new UserDaoImpl();

        System.out.println("""
                
                1. Add user
                2. Get user by ID
                3. Get all users
                4. Update user
                5. Delete user
                """);
        switch(scanner.nextInt()) {
            case 1:
                User user = new User();
                System.out.println("Enter name: ");
                user.setName(scanner.next());
                System.out.println("Enter age: ");
                user.setAge(scanner.nextInt());
                System.out.println("Enter gender: ");
                user.setGender(Gender.valueOf(scanner.next().toUpperCase()));
                System.out.println(userDao.addUser(user));
                break;
                case 2:
                    System.out.println("Enter ID: ");
                    System.out.println(userDao.getUserById(AcceptUserInfo.getUserNumInLong()));
                    break;
                    case 3:
                        System.out.println(userDao.getAllUsers());
                        break;
                        case 4:
                            User newUser = new User();
                            System.out.println("Enter name: ");
                            newUser.setName(scanner.next());
                            System.out.println("Enter age: ");
                            newUser.setAge(scanner.nextInt());
                            System.out.println("Enter ID: ");
                            System.out.println(userDao.updateUser(AcceptUserInfo.getUserNumInLong(), newUser));
                            break;
                            case 5:
                                System.out.println("Enter ID: ");
                                System.out.println(userDao.deleteUser(AcceptUserInfo.getUserNumInLong()));
                                break;
        }
    }
}