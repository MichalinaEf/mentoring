package org.mentoring.exercises;

import java.util.*;

public class Ex20 {

    public static void ex20(){
        System.out.println("Treść:");
        System.out.println("Utwórz listę składającą się z następujących elementów: \n" +
                "\n'zielony', 'czerwony', 'niebieski', 'czarny', 'fioletowy', 'granatowy', " +
                "\n'niebieski', 'czarny', 'czarny', 'zielony', 'cytrynowy', 'granatowy', " +
                "\n'niebieski', 'indygo', 'zielony', 'czerwony'\n" +
                "Przekształć tę listę w zbiór i zachowaj pod nową nazwą, a następnie:\n" +
                "- policz, ile elementów zawiera oryginalna lista kolorów\n" +
                "- policz, ile różnych kolorów zostało użytych\n" +
                "- wyświetl każdy z elementów zbioru w oddzielnej linii\n" +
                "- dodaj do zbioru nazwę jakiegoś innego koloru (sprawdź efekt przez wyświetlenie zawartości)\n" +
                "- usuń ze zbioru jakiś kolor (ponownie sprawdź efekt)\n");
        System.out.println("Odpowiedź:");
        ex20Solution();
    }

    private static void ex20Solution() {
        List <String> coloursAsList = new ArrayList<>(Arrays.asList("zielony", "czerwony", "niebieski", "czarny", "fioletowy", "granatowy",
                "niebieski", "czarny", "czarny", "zielony", "cytrynowy", "granatowy", "niebieski", "indygo", "zielony",
                "czerwony"));
        Set<String> coloursAsSet = new HashSet<>(coloursAsList);

        int sizeOfList = coloursAsList.size();
        int sizeOfSet = coloursAsSet.size();

        System.out.println("Lista ma rozmiar: " + sizeOfList + ", a zbiór: " + sizeOfSet + ", czyli zostało użytych: "+
                sizeOfSet + " różnych kolorów.");
        for (String colour:coloursAsSet) {
            System.out.println(colour);
        }

        coloursAsSet.add("fuksja");
        for (String colour:coloursAsSet) {
            System.out.println(colour);
        }
    }
}
