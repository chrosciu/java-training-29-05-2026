package eu.chrost.day5.s1exceptions.lectures.p4finally;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tworzenie scannera");
        //scanner jest zasobem - otwiera strumien wejsciow i go trzyma
        //zasoby powinny byc zwalniane przez programiste gdy juz nie sa potrzebne
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj liczbę całkowitą:");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Wczytana liczba: " + number);
//        } catch (NumberFormatException e) {
//            System.out.println("Błąd: Podana wartość nie jest liczbą całkowitą.");
//            throw e;
//        } catch (Exception e) {
//            //klauzul catch moze byc wiecej niz jedna - wykonywana jest ta, ktora zostanie dopasowana jako pierwsza
//            //co oznacza ze trzeba je deklarowac od najbardziej szczegolowych do najbardziej ogolnych klas wyjatkow
//            System.out.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
        } finally {
            //klauzula finally jest ostatnia czescia klauzuli try-catch
            //w jej bloku wstawiamy kod ktory ma sie wykonac
            //niezaleznie od tego czy kod w klauzuli try wykonal sie z wyjatkiem lub bez
            //oraz nawet wtedy gdy wyjatek nie zostal przechwycony i ma zostac wyrzucony na zewnatrz
            //ogolnie: ten blok ma wykonac sie ZAWSZE

            //klauzula finally moze takze zostac wstawiona jesli nie dajemy zadnej klauzuli catch

            //zwalnianie zasobu
            System.out.println("Zamykanie scannera");
            scanner.close();
        }

    }
}
