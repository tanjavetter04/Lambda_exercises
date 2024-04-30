package _05_filter;

// Gib mithilfe einer Lambda Funktion in Europa gemessene Temperaturen aus

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> temperatures_continents = List.of(
            Map.entry("Asia", 32),
            Map.entry("Asia", 28),
            Map.entry("Europe", 20),
            Map.entry("North America", 25),
            Map.entry("Europe", 30),
            Map.entry("Antarctica", -40),
            Map.entry("North America", 35),
            Map.entry("Europe", 18),
            Map.entry("North America", 22),
            Map.entry("Europe", 28)
        );

        List<Map.Entry<String, Integer>> europe_temperatures = temperatures_continents.stream()
                .filter(entry -> entry.getKey().equals("Europe"))
                .collect(Collectors.toList());

        System.out.println(europe_temperatures);
    }
}
