package eu.chrost.day5.s5streams.task1.trainer;

import eu.chrost.day5.s5streams.task1.Car;
import eu.chrost.day5.s5streams.task1.Cars;
import eu.chrost.day5.s5streams.task1.Color;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getAllCarsBrands());
        System.out.println(getAllCarsWithColor(Color.RED));
    }

    private static List<String> getAllCarsBrands() {
        return Cars.CARS.stream()
                .map(car -> car.brand())
                .toList();
    }

    private static List<Car> getAllCarsWithColor(Color color) {
        return Cars.CARS.stream()
                .filter(car -> car.color() == color)
                .toList();
    }
}
