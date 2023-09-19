package org.mentoring.exercises;

public class Ex3 {

    public static void ex3(){
        System.out.println("Treść:");
        System.out.println("Które z poniższych zdań są prawdziwe?\n" +
                "a) Klasa to obiekt.\n" +
                "b) Klasa to typ.\n" +
                "c) Składnikiem klasy może być obiekt typu double.\n" +
                "d) Składnikiem klasy może być metoda.\n" +
                "e) Składnikiem klasy może być obiekt innej klasy.\n");
        System.out.println("Odpowiedź:");
        System.out.println(
                "a - false, na podstawie klasy możemy tworzyć obiekty, ale klasa sama w sobie obiektem nie jest" +
                "\nb - true, klasa jest typem, który defniuje strukturę i zachowanie tworzonych na jej podstawie obietków" +
                "\nc - false, klasa definiuje strukturę obiektu, ale nie jest to konkretna wartość numeryczna" +
                "\nd - true, metody te określają zachowanie obiektu stworzonego na podstawie klasy" +
                "\ne - true, można tworzyć zagnieżdżone struktury klas, które zawierają obiekty innych klas.");
    }
}
