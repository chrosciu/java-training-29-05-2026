package eu.chrost.day5.s3autoboxing.lectures;

public class Main {
    public static void main(String[] args) {
        //w Javie 5 wprowadzono klasy pozwalajace na modelowanie dotychczasowych typow primtywnych
        //jak sie mozna domyslic tego typu obiekty mozna po prostu skonstruowac
        //(co prawda nie przez konstruktor bo jest uznany za deprecated)
        Integer intAsObject = Integer.valueOf(5);

        //mozna z tego tez z powrotem wyciagnac wartosc
        int intAsPrimitive = intAsObject.intValue();

        //tego typu konwersje sa jednak uciazliwe wiec przyjeto zalozenie
        //ze w miejsu w ktorym oczekiwany jest obiekt Integer mozna przekazac wartosc int
        //i odwrotnie - tam gdzie chcemy int mozna przekazac duzy Integer
        //konwersja miedzy nimi zostanie zrobiona automatycznie - przez tzw. autoboxing

        //dzieki temu mozliwe sa takie przypisania
        Integer xObj = 7;
        int xInt = xObj;
        System.out.println(xInt);

        //uwaga - pulapka jest przy wartosci null
        Integer nullObj = null;
        //kod sie skompiluje ale w runtime rzuci NPE
        int nullInt = nullObj;

    }
}
