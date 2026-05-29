package eu.chrost.day5.s5streams.lectures.p1basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

record User(String name, int age) {}

class UserToNameMapper implements Function<User, String> {
    @Override
    public String apply(User user) {
        return user.name();
    }
}

class UserOlderThan40Predicate implements Predicate<User> {
    @Override
    public boolean test(User user) {
        return user.age() > 40;
    }
}

public class Main {
    private static final List<User> users = List.of(
            new User("Marcin", 44),
            new User("Tomasz", 41),
            new User("Pawel", 38)
    );

    public static void main(String[] args) {
        System.out.println("All users names: " + getUsersNames());
        System.out.println("All users names: " + getUsersNamesWithStream());
        System.out.println("All users names: " + getUsersNamesWithStreamShortened());
        System.out.println("Users above 40 names: " + getUsersAbove40Names());
    }

    //pobierz imiona wszystkich uzytkownikow i zwroc jako liste
    public static List<String> getUsersNames() {
        //klasyczne rozwiazanie wymaga stworzenia nowej listy
        List<String> names = new ArrayList<>();
        //a nastepnie iteracji po oryginalnej liscie
        //wyciagniecia kazdego imienia
        //i wlozenia na nowa liste
        for (User user : users) {
            names.add(user.name());
        }
        //i na koncu trzeba zwrocic nowa liste
        return names;
    }

    public static List<String> getUsersNamesWithStream() {
        //strumieniowe przetwarzanie danych sluzy nam do przetworzenia wszytkich elementow jakiejs kolekcji
        //i wygenerowania jakiegos wyniku (kolekcji, pojedynczej wartosci, etc.)

        //aby moc pracowac strumieniowo nalezy przede wszystkim stworzyc strumien
        //jest on typu Stream
        //a wiekszosc kolekcji oferuje metode stream, ktora pozwala na wygenerowanie strumienia z kolekcji
        Stream<User> usersStream = users.stream();

        //kolejnym etapem jest podpiecie jednej z operacji posrednich
        //jest ich sporo, ale ta najbardziej podstawowa jest map()
        //ktora to operacja zamienia kazdy element strumienia wejsciowego na inny (moze to zmienic typ elementu)
        //na podstawie tzw. funkcji mapujacej implementujacej interfejs Function
        //po takiej operacji dalej mamy strumien ale obiektow typu String
        Stream<String> namesStream = usersStream.map(new UserToNameMapper());

        //aby strumien faktycznie sie uruchomil i wygenerowal nam jakas wartosc
        //jest wpiecie tzw. operacji terminujacej
        //my uzyjemy takiej najbardziej podstawowej - czyli toList()
        List<String> names = namesStream.toList();

        //na koncu zwracamy liste
        return names;
    }

    public static List<String> getUsersNamesWithStreamShortened() {
        return users.stream()
                .map(new UserToNameMapper())
                .toList();
    }

    //zrob to samo co powyzej ale tylko dla uzytkownikow starszych niz 40 lat
    public static List<String> getUsersAbove40Names() {
        return users.stream()
                //wpinamy tylko operator filter pozwalajacy usunac elementy
                //nie spelniajace danego warunku
                .filter(new UserOlderThan40Predicate())
                .map(new UserToNameMapper())
                .toList();
    }
}
