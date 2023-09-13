package org.mentoring.exercises;

public class Ex5 {

    public static void ex5(){
        System.out.println("Treść:");
        System.out.println("Napisz program wyświetlający liczby z przedziału <0, 5, 10, 15, …, 100>");
        System.out.println("Odpowiedź:");
        ex5Solution();
    }

    private static void ex5Solution(){
        for (int i = 0; i <=100; i+=5) {
            System.out.println(i);
        }
    }
}
