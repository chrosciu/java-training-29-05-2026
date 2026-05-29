package eu.chrost.day5.s2libraries.lectures;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marcin", "Chrost", 43);
        System.out.println(person);

        //Zadanie - zamienic obiekt person na JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("JSON: " + json);

        //kazda klasa w Javie ma property o nazwie class
        //ktore zwraca obiekt typu Class uzywany przez wiele bibliotek jako informacje
        //o type jakiego trzeba uzyc
        Person personFromJson = gson.fromJson(json, Person.class);
        System.out.println("Person from JSON: " + personFromJson);

        System.out.println("person equals personFromJson: " + person.equals(personFromJson));
    }
}
