import enums.Gender;
import models.User;
import service.UserService;
import service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.addUser (new User(1L,"Adilet",22,Gender.MALE));
        userService.addUser (new User(2L,"Eleman",21,Gender.MALE));
        userService.addUser (new User(3L,"Sakina",20,Gender.FEMALE));
        userService.addUser (new User(4L,"Alnura",19,Gender.FEMALE));
        userService.addUser (new User(5L,"Murlan",18,Gender.FEMALE));
        userService.addUser (new User(6L,"Enes",17,Gender.MALE));
        userService.addUser (new User(7L,"Sanjar",16,Gender.MALE));
        userService.addUser (new User(8L,"Aruke",15,Gender.FEMALE));
        userService.addUser (new User(9L,"Aizat",23,Gender.FEMALE));
        userService.addUser (new User(10L,"Kyrmanbek",24,Gender.MALE));
    }
}