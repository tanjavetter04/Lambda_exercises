package _02_map;

// Rechne die gegebenen Temperaturen mithilfe einer Lambda Funktion in Fahrenheit um (Temperatur * 1.8 + 32)

import java.util.List;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> temperatures_celsius = List.of(25, 30, 22, 18, 28, 35, 20);

        List<Double> temperature_fahrenheit = temperatures_celsius.stream()
                                                .map(c -> (c * 9.0 / 5) + 32)
                                                .collect(Collectors.toList());

        System.out.println(temperature_fahrenheit);
    }
}
