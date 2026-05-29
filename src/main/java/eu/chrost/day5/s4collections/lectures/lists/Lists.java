package eu.chrost.day5.s4collections.lectures.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        //w Javie 1.5 wprowadzono tzw typy generyczne
        //pozwalajace ukonkretnienie danej klasy jakims typem
        //i ograniczajace jej uzycie do tego konkretnego typu

        //zatem tworzymy zmienna tego typu i ukonkretniamy mowiac
        //ze bedzie ona przechowywac wartosci typu String
        //poniewaz List to tylko interfejs to potrzebujemy konkretnej implementacji
        //najczesciej uzywany jest ArrayList - pod spodem uzywana jest tablica
        //trzeba tez bylo kiedys przekazac typ generyczny taki sam jak w interfejsie List
        //ale od Javy 7 kompilator potrafi sie tego domyslic i wystarczy tylko sam zapis <>
        List<String> list = new ArrayList<>();

        list.add("Marcin");
        list.add("Chrost");

        //for-each tez da sie do listy - bo implementuje ona interfejs Iterable
        for (String s: list) {
            System.out.println(s);
        }

        //toString jest nadpisany od razu - nie trzeba specjalnych metod do wypisania zawartosci.
        System.out.println(list);

        //lista ma takze metode size()
        System.out.println(list.size());

        //usuwanie jest proste
        list.remove(1);

        //rowniez mozna sprawdzic czy lista zawiera konkretny obiekt
        System.out.println(list.contains("Marcin"));
        System.out.println(list.contains("Chrost"));

        System.out.println(list);

    }
}
