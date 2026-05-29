package eu.chrost.day5.s1exceptions.lectures.p3custom;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Age is invalid : " + age + " - should be at least 18");
    }
}
