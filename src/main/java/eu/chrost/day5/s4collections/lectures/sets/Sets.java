package eu.chrost.day5.s4collections.lectures.sets;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        //Set jest podobny do List ale nie pozwala na trzymanie zduplikowanych elementow
        //podstawowa implementacja jest HashSet
        //ktory trzyma dane w tzw. kubelkach
        //wyliczanych na podstawie hashCode()
        Set<String> textSet = new HashSet<>();

        textSet.add("Marcin");
        textSet.add("Tomasz");
        //ten obiekt sie nie doda bo taki juz istnieje w tym secie
        textSet.add("Marcin");
        textSet.add("Pawel");

        System.out.println(textSet);
        System.out.println(textSet.size());

    }
}
