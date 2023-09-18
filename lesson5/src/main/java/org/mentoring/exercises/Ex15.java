package org.mentoring.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex15 {

    public static void ex15(){
        System.out.println("Treść:");
        System.out.println("Napisz program, który utworzy Array Listę i dodaj do niej 8 dowolnych kolorów w formie Stringów.\n" +
                "Dopisz funkcjonalności:\n" +
                "Przeiteruj przez każdy element list\n" +
                "Zastąp 5-ty element kolorem: lilac\n" +
                "Dodaj na sam początek listy nowy kolor: turquoise\n" +
                "Posortuj listę kolorów\n" +
                "Utwórz nową listę - reversedColours - która będzie przechowywała te same elementy, " +
                "\nco wcześniej utworzona lista, ale będą one przechowywane w odwrotnej kolejności.\n");
        System.out.println("Odpowiedź:");
        ex15Solution();
    }

    private static void ex15Solution() {
        List<String> colours = new ArrayList<>();
        List<String> reversedColours = new ArrayList<>();

        colours.add("white");
        colours.add("black");
        colours.add("red");
        colours.add("orange");
        colours.add("yellow");
        colours.add("green");
        colours.add("blue");
        colours.add("purple");

        System.out.println(colours);
        System.out.println();

        colours.set(4,"lilac");

        System.out.println(colours);
        System.out.println();

        colours.add(0,"turquoise");
        System.out.println(colours);
        System.out.println();

        Collections.sort(colours);
        System.out.println(colours);
        System.out.println();

        for (int i = colours.size()-1; i >= 0; i--) {
            reversedColours.add(colours.get(i));
        }
        System.out.println(reversedColours);
        System.out.println();
    }
}
