package org.mentoring.exercises;

import java.util.Map;
import java.util.Scanner;

public class Ex6 {

    public static void ex6(){
        System.out.println("Treść:");
        System.out.println("Napisz program, wyświetlający n kolejnych potęg liczby 2. Wartość n podaje użytkownik.\n");
        System.out.println("Odpowiedź:");
        ex6Solution();
    }

    private static void ex6Solution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("2^" + i +" = ");
            System.out.println((int)Math.pow(2,i));
        }
    }

}
