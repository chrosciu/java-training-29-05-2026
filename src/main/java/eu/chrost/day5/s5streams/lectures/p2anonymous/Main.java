package eu.chrost.day5.s5streams.lectures.p2anonymous;

import java.util.List;
import java.util.function.Function;

record User(String name, int age) {}

public class Main {
    private static final List<User> users = List.of(
            new User("Marcin", 44),
            new User("Tomasz", 41),
            new User("Pawel", 38)
    );

    public static void main(String[] args) {
        System.out.println("All users names: " + getUsersNames());
    }

    public static List<String> getUsersNames() {
        return users.stream()
                //w Javie jest mozliwosc definiowania klas
                //"jednorazowego uzytku" bez nadawania im nazwy
                //czyli tzw klas anonimowych
                //zwykle wykorzystuje sie to gdy chcemy zrobic ad-hocowa
                //implementacje jakiegos interfejsu
                //w tym celu tam gdzie mamy do czynienia z taka koniecznoscia
                //uzywamy operatora new i definiujemy cialo klasy
                .map(new Function<User, String>() {
                    @Override
                    public String apply(User user) {
                        return user.name();
                    }
                })
                .toList();
    }
}
