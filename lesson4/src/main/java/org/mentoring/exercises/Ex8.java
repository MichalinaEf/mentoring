package org.mentoring.exercises;

import java.util.Scanner;

public class Ex8 {

    public static void ex8(){
        System.out.println("Treść:");
        System.out.println("Zadanie polega na napisaniu programu, który będzie sumować liczby całkowite wpisane " +
                "\nprzez użytkownika tak długo, aż po wczytaniu poprzedniej liczby suma zwiększyła się. " +
                "\nNa koniec program wypisuje ostateczną sumę Początkowo suma wynosi 0. " +
                "\nZastosuj do tego rozwiązania pętlę while.");
        System.out.println("Odpowiedź:");
        ex8Solution();
    }

    private static void ex8Solution() {
        int sum = 0;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer positive number to define maximum range");
        int max = sc.nextInt();
        while (i < max) {
            System.out.println("Enter an integer numeber");
            int n = sc.nextInt();
            sum += n;
            i++;
        }
        System.out.println(sum);
    }
}
