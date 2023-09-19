package org.mentoring.exercises;

import org.mentoring.exercises.exercise9.Multiplication;

public class Ex9 {

    public static void ex9(){
        System.out.println("Treść:");
        System.out.println("Stwórz klasę Multiplication z metodą execute, której zadaniem będzie obliczanie " +
                "\niloczynu wartości i będzie dostosowana pod działanie na float-ach, int-ach i argumentach typu double. " +
                "\nWykorzystaj przeładowanie metody.\n");
        System.out.println("Odpowiedź:");
        Multiplication multiplication = new Multiplication();
        multiplication.execute(5,2);
        multiplication.execute(0.5f, 0.7f);
        multiplication.execute(2.5,5.0);
    }
}
