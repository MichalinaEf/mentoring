package org.mentoring.exercises;

public class Ex14 {

    public static void ex14(){
        System.out.println("Treść:");
        System.out.println("Wyszukaj w zewnętrznych źródłach i przedyskutuj z mentorem, " +
                "\njaka jest różnica między ArrayList a LinkedList.\n");
        System.out.println("Odpowiedź:");
        System.out.println("ArrayList i LinkedList to dwie odmienne implementacji list." +
                "- ArrayListy opiera się o tablice dynamiczne. Posiada indeksy, dzięki czemu jest do nich szybki dostęp.\n" +
                "- w LinkedListach każdy element jest powiązany z elementem poprzedzającym oraz następującym." +
                "Dostęp do elementów za pomocą indeksów jest wolniejszy. dostęp do elementów odbywa się poprzez przechodzenie od początku lub końca listy\n" +
                "W ArrayList dodawanie i usuwanie elementów w środku listy jest wolniejsze niż w przypadku LinkedListy, \n" +
                "ponieważ po wstawieniu lub usunięciu elementu w ArrayList musi przesunąć wszystkie elementy, które są po nim\n" +
                "-ArrayList powinna zajmować mniej pamięci w komputerze, ponieważ nie ma zapisanych połączeń między elementami\n" +
                "-ArrayList będzie lepszym wyborem, jeżli potrzebny jest szybki dostęp do elementów, oraz elementy dodawane i usuwane są\n" +
                "z końca albo początku listy\n" +
                "- LinkedList będzie lepszym wyborem, jeżeli wykonuje się często wstawianie i usuwanie elementów w śroku listy. "
        );
    }
}
