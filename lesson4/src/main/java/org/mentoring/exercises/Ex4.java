package org.mentoring.exercises;

public class Ex4 {

    public static void ex4(){
        System.out.println("Treść:");
        System.out.println("Napisz program wyświetlający liczby całkowite z przedziału <100; 50> w porządku malejącym. " +
                "\nWykonaj to na pętli for i while.\n");
        System.out.println("Odpowiedź:");
        ex4Solution();
    }

    private static void ex4Solution(){
        for (int i = 100; i >=50 ; i--) {
            System.out.println(i);
        }
    }
}
