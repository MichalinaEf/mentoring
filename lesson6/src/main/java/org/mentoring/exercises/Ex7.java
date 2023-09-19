package org.mentoring.exercises;

public class Ex7 {

    public static void ex7(){
        System.out.println("Treść:");
        System.out.println("Czym jest przeciążanie metod i jakie są plusy/potencjalne zagrożenia takiego rozwiązania?\n");
        System.out.println("Odpowiedź:");
        System.out.println("Przeciążanie metod (method overloading) w języku Java to technika programistyczna, " +
                        "\nktóra pozwala na tworzenie wielu metod o tej samej nazwie w jednej klasie, " +
                        "\nale z różnymi parametrami. Parametry te różnią się typami, licznością lub kolejnością. " +
                        "\nKompilator i JVM (Java Virtual Machine) potrafią rozróżnić te metody na podstawie ich sygnatury " +
                        "\n(czyli typów i liczby parametrów). Przeciążanie metod jest często wykorzystywane " +
                        "\nw celu zwiększenia elastyczności i czytelności kodu." +
                "\nZaletą tego rozwiązania jest na pewno to, że programista nie musi za każdym razem tworzyć metod " +
                "\no różnych nazwach, gdy chcemy zapewnić tę samą funkcjonalność, ale z różnymi typami zmiennych." +
                "\nPotencjalnym zagrożeniem jest:" +
                "\n- Przeciążanie metod może prowadzić do niejednoznaczności w przypadku, " +
                "\ngdy kompilator nie może jednoznacznie określić, która z przeciążonych metod ma być wywołana. " +
                "\nNa przykład, gdy dostępne są różne wersje metody z bardzo podobnymi parametrami." +
                "\n- Jeśli nieostrożnie przeciążysz metody i nie uwzględnisz " +
                "\nich odpowiednich sygnatur, to może to prowadzić do błędów w czasie działania programu." +
                "\n- Przeciążanie metod może sprawić, że kod staje się bardziej skomplikowany, " +
                "\nzwłaszcza gdy liczba przeciążonych metod rośnie.");
    }
}
