package org.mentoring.exercises;

import java.util.Scanner;

public class Ex3 {

    public static void ex3(){
        System.out.println("Treść:");
        System.out.println("Napisz program wyświetlający liczby całkowite z przedziału <0; y>, " +
                "\ngdzie y podaje użytkownik. Wykonaj to na pętli for i while.\n");
        System.out.println("Odpowiedź:");
        ex3Solution();
    }

    private static void ex3Solution(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter an integer");
        int y = sc.nextInt();
        System.out.println("Loop for :");
        for (int i = 0; i <= y; i++) {
            System.out.println(i);
        }
        System.out.println("Loop while");
        int i = 0;
        while (i<=y){
            System.out.println(i);
            i++;
        }
    }
}
