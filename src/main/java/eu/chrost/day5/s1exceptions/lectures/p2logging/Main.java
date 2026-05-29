package eu.chrost.day5.s1exceptions.lectures.p2logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger =
            Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        String s = "abc";

        try {
            int i = getIntNumberFromString(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            //taka wersja jest niezalecana - ciezko sie to czyta + zajmuje niepotrzebnie pamiec
            //logger.warning("String " + s + " cannot be parsed as int");

            //ta wersja pozwala na podstawianie parametrow do message
            //dodatkowo jest tak ze faktyczne zlozenie wynikowego message jest robione tylko wtedy
            //gdy log ma zostac rzeczywiscie wypisany
            //(czyli jego level jest rowny lub wiekszy niz ustawiony prog logowania)
            logger.log(Level.WARNING, "String {0} cannot be parsed as int", s);

            //aby zalogowac stacktrace trzeba sie posluzyc ogolniejsza metoda log()
            //przekazujemy do niej jako ostatni argument nasz wyjatek
            logger.log(Level.WARNING, "Failed to parse string", e);

        }
    }

    private static int getIntNumberFromString(String s) {
        return Integer.parseInt(s);
    }
}
