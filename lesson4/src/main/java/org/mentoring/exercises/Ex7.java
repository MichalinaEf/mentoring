package org.mentoring.exercises;

import java.util.Scanner;

public class Ex7 {

    public static void ex7(){
        System.out.println("Treść:");
        System.out.println("Napisz program, który wyświetli liczby z przedziału <50; 100> " +
                "\npodzielne przez całkowitą liczbę k, którą podaje użytkownik. " +
                "\nPrzekształć program tak, aby przedział podawał również użytkownik. \n");
        System.out.println("Odpowiedź:");
        ex7Solution();
        ex7SolutionEdited();
    }

    private static void ex7SolutionEdited() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minimum of the range:");
        int min = sc.nextInt();
        System.out.println("Enter maximum of the range:");
        int max = sc.nextInt();
        System.out.println("Enter an integer number");
        int k = sc.nextInt();
        System.out.println("Numbers dividable by " + k +":");
        for (int i = min; i <= max ; i++) {
            if(i%k==0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
    }

    private static void ex7Solution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int k = sc.nextInt();
        System.out.println("Numbers dividable by " + k +":");
        for (int i = 50; i <= 100 ; i++) {
            if(i%k==0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
    }
}
