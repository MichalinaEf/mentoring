package org.mentoring.exercises;

import java.util.Scanner;

public class Ex15 {
    public static void ex15(){
        System.out.println("Treść:");
        System.out.println("Napisz program, który sprawdzi, czy podana przez usera liczba jest doskonała. " +
                "\nLiczba doskonała, to taka liczba, która jest sumą wszystkich swoich dzielników właściwych " +
                "\n(czyli mniejszych od niej samej).\n" +
                "Przykłady liczb doskonałych: 6 (6 = 1 + 2 + 3), 28, 496, 8128.\n");
        System.out.println("Odpowiedź:");
        ex15Solution();
    }

    private static void ex15Solution() {
        Scanner sc = new Scanner(System.in);
        // wprowadziłam dodatkową pętlę, aby od razu sprawdzić program na 5 liczbach
        for (int j = 0; j < 5; j++) {
            System.out.println("Wprowadź liczbę naturalną");
            int number = sc.nextInt();
            int sumDividers = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumDividers += i;
                }
            }
            if (number == sumDividers)
                System.out.println(number + " jest liczbą doskonałą!");
            else
                System.out.println(number + " nie jest liczbą doskonałą");
        }
    }
}
