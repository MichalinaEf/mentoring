package org.mentoring.exercises;

import org.mentoring.exercises.exercise4.Student;

public class Ex4 {

    public static void ex4(){
        Student student1 = new Student("Michalina", "Futkowska", 1991, "144882");
        System.out.println("Treść:");
        System.out.println("Stwórz klasę reprezentującą studenta. " +
                "\nCechy studenta określaj z poziomu odpowiednich metod. " +
                "\nDodaj do klasy metodę wyświetlającą informacje o danym obiekcie. " +
                "\nPamiętaj o odpowiednim podziale struktury projektu (utwórz nowy plik na klasę).\n");
        System.out.println("Odpowiedź:");
        System.out.println(student1.toString());

    }
}
