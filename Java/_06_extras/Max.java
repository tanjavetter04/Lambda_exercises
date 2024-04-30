package _06_extras;

// Berechne die Maximaltemperatur mithilfe einer Lambda Funktion und ohne eine von Java bereitgestellte Funktion

import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<Integer> temperatures_celsius = List.of(25, 30, 22, 18, 28, 35, 20);

        int max = temperatures_celsius.stream()
                    .reduce(0, (x, y) -> {
                        if (x > y) return x;
                        return y;
                    });

        System.out.println(max);
    }
}
