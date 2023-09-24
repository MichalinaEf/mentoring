package org.mentoring.exercises;

import org.mentoring.exercises.exercise2.Square;

public class Ex2 {

    public static void ex2(){
        System.out.println("Treść:");
        System.out.println("Stwórz klasę Shape i jej podklasę Square. Square ma posiadać konstruktor," +
                "\n który przyjmie length jako argument. Obie klasy mają posiadać metodę obliczającą pole figury. " +
                "\nDomyślnie Shape ma zwracać wartość 0.");
        System.out.println("Odpowiedź:");
        Square square = new Square(5);
        System.out.println("Utworzono kwadrat o boku: " + square.getLength() + "cm");
        int squareArea = square.area(square.getLength());
        System.out.println("Pole tego kwadratu wynosi: " + squareArea+"cm");
    }
}
