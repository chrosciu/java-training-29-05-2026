package eu.chrost.day5.s4collections.lectures.maps;

import java.util.HashMap;
import java.util.Map;

//pola i metody statyczne oraz wartosci enum mozna sobie zaimportowac
//tak aby nie trzeba bylo za kazdym razem pisac nazwy klasy i operatora `.`
import static eu.chrost.day5.s4collections.lectures.maps.Color.BLACK;

enum Color {
    BLACK,
    RED,
    WHITE
}

public class Maps {
    public static void main(String[] args) {
        //Map jest zbiorem par klucz - wartosc
        //przy czym pod jednym kluczem moze byc tylko jedna wartosc
        //i klucze nie moga sie powtarzac
        //Map jest ciekawym typem generycznym bo jest ukonkretniany dwoma roznymi typami
        //- jeden dla klucza, drugi dla wartosci

        //zbudujemy mape w ktorej dla danego koloru bedziemy trzymac ilosc samochodow tego koloru
        //jakie mamy na stanie
        //najbardziej popularna implementacja jest HashMap
        Map<Color, Integer> carStock = new HashMap<>();

        //elementy wstawiamy podajac klucz i wartosc
        carStock.put(BLACK, 1);
        carStock.put(Color.RED, 2);

        //wypisanie zawartosci dziala z automatu
        System.out.println(carStock);

        //for-each moze byc uzyty do iterowania po mapie
        //ale wtedy typ opisujacy element jest dosc skomplikowany
        //dodatkowo trzeba uzyc metody entrySet() ktora zwraca Set zawierajacy poszczegolne pary klucz-wartosc
        for (Map.Entry<Color, Integer> entry : carStock.entrySet()) {
            //i teraz mozna z takiego entry wyciagnac klucz oraz wartosc
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }

        //jest to tez dobry przyklad tego, kiedy slowo kluczowe var potrafi uproscic kod
        for (var entry : carStock.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }

        //wartosc pod kluczem mozna nadpisac
        carStock.put(BLACK, 3);
        System.out.println(carStock);

        //klucz mozna usunac
        carStock.remove(Color.RED);
        System.out.println(carStock);

        //oczywiscie mozna pobrac wartosc spod klucza - jesli danego klucza nie ma dostaniemy null
        System.out.println(carStock.get(BLACK));
        System.out.println(carStock.get(Color.RED));

    }
}
