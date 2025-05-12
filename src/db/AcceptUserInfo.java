package db;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AcceptUserInfo {

    public static int getUserNumInInt(){
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                int n = sc.nextInt();
                return n;
            } catch (InputMismatchException e){
                System.out.println("Incorrect format! Write number!");
                sc.nextLine();
            }
        }
    }

    public static Long getUserNumInLong(){
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                Long n = sc.nextLong();
                return n;
            } catch (InputMismatchException e){
                System.out.println("Incorrect format! Write number!");
                sc.nextLine();
            }
        }
    }
}
