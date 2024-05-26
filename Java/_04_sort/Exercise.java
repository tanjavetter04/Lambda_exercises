package _04_sort;

// Sortiere die Listeneinträge alphabetisch nach den Städtenamen mithilfe einer Lambda Funktion
// (in Java werden Strings mit string1.compareTo(string2) verglichen, nicht mit ==)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Exercise {
    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> temperatures_cities = new ArrayList<>();
        temperatures_cities.add(Map.entry("New York", 10));
        temperatures_cities.add(Map.entry("Los Angeles", 20));
        temperatures_cities.add(Map.entry("Chicago", 5));
        temperatures_cities.add(Map.entry("Houston", 25));

    }
}
