package org.mentoring.exercises;

import java.util.Scanner;

public class Ex4 {
    public static void ex4(){
        System.out.println("Treść");
        System.out.println("Napisz program, który pobierze od użytkownika dowolną liczbę całkowitą. " +
                "Następnie na podstawie danych wejściowych, wyświetlaj komunikat “liczba parzysta” lub “nieparzysta”.\n");
        System.out.println("Odpowiedź:");
    }

    public static void ex4Solution(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();
        if(number%2 == 0){
            System.out.println("Even number\n");
        } else
            System.out.println("Odd number\n");
    }
}
