package eu.chrost.day5.s1exceptions.lectures.p3custom;

public class BusinessAgeException extends RuntimeException {
    public BusinessAgeException(InvalidAgeException original) {
        //bardzo wazne jest przekazanie owijanego oryginalnego wyjatku - tak aby pojawil sie na stacktrace
        super(original);
    }
}
