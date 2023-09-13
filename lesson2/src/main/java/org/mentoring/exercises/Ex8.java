package org.mentoring.exercises;

public class Ex8 {

    public static void ex8(){
        System.out.println("Treść");
        System.out.println("Wskaż nieprawidłowe odpowiedniki dla operatorów przypisania:\n a += 5 -> a = a + 5\n" +
                "a -= 5 -> a = 5 - a\n" +
                "a *= 5 -> a = 5 * a\n" +
                "a *= 5 -> a = a * 5\n" +
                "a /= 5 -> a = 5/a");
        System.out.println("Odpowiedź:");
        System.out.println("a -=5 -> a=5-a\n" +
                "a *=5 -> a=5*a (chociaż tutaj nic się nie zmieni)\n" +
                "a /=5 -> a=5/a\n");
    }
}
