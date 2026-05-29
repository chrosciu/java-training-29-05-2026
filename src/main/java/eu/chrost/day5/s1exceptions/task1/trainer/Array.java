package eu.chrost.day5.s1exceptions.task1.trainer;

import java.util.Arrays;
import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Podaj indeks (0-4), pod którym chcesz wpisać wartość: ");
            String indexInput = scanner.nextLine();
            int index = Integer.parseInt(indexInput);
            System.out.print("Podaj wartość (liczbę całkowitą) do wpisania: ");
            String valueInput = scanner.nextLine();
            int value = Integer.parseInt(valueInput);
            array[index] = value;
            System.out.println("Wartość " + value + " została wpisana pod indeksem " + index + ".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Podano nieprawidłowy indeks. Dopuszczalne indeksy to 0-4.");
        } catch (NumberFormatException e) {
            System.err.println("Wprowadzona wartość nie jest liczbą całkowitą!");
        } finally {
            System.out.println("Zawartość tablicy to:");
            System.out.println(Arrays.toString(array));
        }
    }
}
