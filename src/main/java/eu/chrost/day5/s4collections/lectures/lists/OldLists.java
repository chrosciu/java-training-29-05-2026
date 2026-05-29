package eu.chrost.day5.s4collections.lectures.lists;

import java.util.ArrayList;
import java.util.List;

public class OldLists {
    public static void main(String[] args) {
        //kolekcje w Javie istnialy od samego poczatku
        //ale pozwalaly pierwotnie tylko na trzymanie
        //czegos takiego jak Object
        List oldList = new ArrayList();

        //wlozenie czegos do listy bylo w miare proste
        oldList.add("Marcin");

        //ale juz wyjecie wymagalo brzydkiego rzutowania
        //bo elementy na liscie sa typu Object
        String item = (String) oldList.get(0);

        //dodatkowo nie zapewnialo to zadnej kontroli typow
        //cos takiego sie oczywiscie skompiluje
        //ale wyrzuci wyjatek w runtime
        Integer intItem = (Integer) oldList.get(0);
    }
}
