package eu.chrost.day5.s1exceptions.lectures.p3custom;

public class Main {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("Marcin", 17);
        } catch (InvalidAgeException e) {
            //czesta praktyka - lapanie wyjatku, owiniecie innym - bardziej biznesowym, wysokopoziomowym
            //i rzucenie ponownie
            throw new BusinessAgeException(e);
        }
    }
}
