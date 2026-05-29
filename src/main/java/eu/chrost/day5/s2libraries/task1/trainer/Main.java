package eu.chrost.day5.s2libraries.task1.trainer;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Fiat", "Punto", 2005);
        System.out.println(car);

        Gson gson = new Gson();
        String json = gson.toJson(car);
        System.out.println("JSON: " + json);

        Car carFromJson = gson.fromJson(json, Car.class);
        System.out.println("Car from JSON: " + carFromJson);

        System.out.println("car equals carFromJson: " + car.equals(carFromJson));
    }
}
