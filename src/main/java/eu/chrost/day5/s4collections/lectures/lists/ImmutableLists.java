package eu.chrost.day5.s4collections.lectures.lists;

import java.util.List;

public class ImmutableLists {
    public static void main(String[] args) {
        //lista ktora jest niezmienna - tworzy sie jeszcze prosciej
        List<String> list = List.of("Marcin", "Chrost");

        //takiej listy nie mozna jednak zmodyfikowac
        //kod sie skompiluje ale w runtime rzuci UnsupportedOperationException
        list.add("Tomasz");
    }
}
