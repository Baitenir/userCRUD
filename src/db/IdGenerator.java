package db;

public class IdGenerator {
    private static Long userId = 0L;

    public static Long GenerateIdForUser(){
        return ++userId;
    }
}
