package org.mentoring.exercises;

import java.util.Scanner;

public class Ex5 {
    public static void ex5(){
        System.out.println("Treść");
        System.out.println("Napisz program “FizzBuzz”, który będzie pobierał od użytkownika dowolną liczbę całkowitą i będzie wyświetlał komunikat:\n" +
                "“Fizz”, gdy liczba ta jest podzielna przez 3\n" +
                "“Buzz”, gdy liczba ta jest podzielna przez 4\n" +
                "“FizzBuzz”, gdy liczba ta jest podzielna przez 3 i 4 równocześnie\n" +
                "“N/A”, gdy liczba ta nie jest podzielna ani przez 3, ani przez 4\n");
        System.out.println("Odpowiedź:");
        fizzBuzz();
    }

    private static void fizzBuzz () {
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer number");
            int number = scanner.nextInt();
            if (number % 12 == 0    ) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 4 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println("N/A");
        }
    }
}
