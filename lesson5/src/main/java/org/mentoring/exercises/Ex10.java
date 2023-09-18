package org.mentoring.exercises;

public class Ex10 {

    public static void ex10(){
        System.out.println("Treść:");
        System.out.println("Napisz program w którym będzie tablica dwuwymiarowa o rozmiarach: " +
                "\n10 rzędów i 3 kolumny. Do elementów zerowej kolumny załaduj kolejne liczby naturalne(i), " +
                "\ndo elementów następnej kolumny załaduj ich kwadraty(i*i), a do następnej sześciany (i*i*i).\n" +
                "Wypisz zawartość tej tablicy na ekranie – właśnie w postaci trzech pionowych kolumn.\n");
        System.out.println("Odpowiedź:");
        ex10Solution();
    }

    private static void ex10Solution() {
        int[][] arr = new int[10][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) Math.pow((double) (i),(double)(j+1));
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
