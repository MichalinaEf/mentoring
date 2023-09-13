package org.mentoring.exercises;

public class Ex9 {

    public static void ex9(){
        System.out.println("Treść:");
        System.out.println("Wypisz wartość średniej arytmetycznej pierwszych 10 liczb naturalnych");
        System.out.println("Odpowiedź:");
        ex9Solution();
    }

    private static void ex9Solution() {
        int sum = 0;
        int max = 10;
        for (int i = 1; i <=max ; i++) {
            sum+=i;
        }

        double avg =  (double) sum/max;
        System.out.println(sum);
        System.out.println(avg);
    }
}
