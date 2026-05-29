package eu.chrost.day5.s1exceptions.lectures.p3custom;

public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            //throw new IllegalArgumentException("Age is invalid : " + age + " - should be at least 18");
            //zarowno wyjatki wbudowane jak i customowe rzucamy poprzez slowo kluczowe throw + obiekt wyjatku do rzucenia

            //jesli wyjatek jest wyjatkiem sprawdzalnym (czyli dziedziczacym po Exception a nie po RuntimeException
            //to wowczas musi zostac albo obsluzony
            //albo zadeklarowany na poziomie metody w ktorej moze wystapic poprzez slowo kluczowe throws
            throw new InvalidAgeException(age);
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
