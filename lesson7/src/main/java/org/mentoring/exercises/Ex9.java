package org.mentoring.exercises;

public class Ex9 {

    public static void ex9(){
        System.out.println("Treść:");
        System.out.println("Stwórz program symulujący talię kart (klasa Deck) oraz pojedyncze karty (klasa Card). " +
                "\nKarta ma być związana z takimi polami jak: wartość (np. 9) oraz figura (np. Diamond). " +
                "\nW klasie Deck znajdować ma się lista reprezentująca stos kart w ramach jednej talii. \n" +
                "\n" +
                "W Deck stwórz metody które pozwolą: \n" +
                "Przemieszać karty (istnieje klasa w Javie, która posiada już taką funkcjonalność).\n" +
                "Wylosować dowolną kartę.\n" +
                "Zwrócić ostatnią kartę z talii.\n" +
                "Podpowiedź:\n" +
                "Talia kart ma się składać z 52 różnych obiektów Card o wszystkich możliwych kombinacjach pól, " +
                "\nnp. (A - Diamond, A - Clubs itd). Aby utworzyć taką kombinację, " +
                "\nutwórz dwie niezależne listy - w pierwszej przechowuj możliwe figury, a w drugiej wartości. " +
                "\nNastępnie przechodząc pętlami, łącz je ze sobą i twórz obiekty.\n");
        System.out.println("Odpowiedź:");
        System.out.println("");
    }
}
