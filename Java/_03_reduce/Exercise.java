package _03_reduce;

// Berechne die Durchschnittstemperatur mithilfe einer Lambda Funktion

import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> temperatures_celsius = List.of(25, 30, 22, 18, 28, 35, 20);

        double average_temperature = temperatures_celsius.stream()
                    .reduce(0, (x, y) -> x + y) / (double)temperatures_celsius.size();

        System.out.println(average_temperature);
    }
}
