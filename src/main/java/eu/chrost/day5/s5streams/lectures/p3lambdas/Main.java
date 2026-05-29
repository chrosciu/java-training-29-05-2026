package eu.chrost.day5.s5streams.lectures.p3lambdas;

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
                //jezeli mamy do zaimplementowania interfejs zawierajacy tylko jedna metode
                //to wowczas mozna zamiast tworzenia klasy anonimowej
                //zapisac cialo tej metody w postaci lambdy
                //(tzw. funkcja ze strzalka)
                //lambda zawiera liste argumentow (jesli jest tylko jeden to mozna nawet pominac nawiasy)
                //nastepnie znak strzalki ->
                //nastepnie albo bezposrednio zwracana wartosc
                //albo blok kodu jesli jest wiecej niz jedna instrukcja
                .map(user -> user.name())
                .toList();
    }
}
