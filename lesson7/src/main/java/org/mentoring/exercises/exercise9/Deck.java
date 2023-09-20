package org.mentoring.exercises.exercise9;

import java.util.List;

//Zad. 9 (T)
//Stwórz program symulujący talię kart (klasa Deck) oraz pojedyncze karty (klasa Card).
// Karta ma być związana z takimi polami jak: wartość (np. 9) oraz figura (np. Diamond).
// W klasie Deck znajdować ma się lista reprezentująca stos kart w ramach jednej talii.
//
//W Deck stwórz metody które pozwolą:
//Przemieszać karty (istnieje klasa w Javie, która posiada już taką funkcjonalność).
//Wylosować dowolną kartę.
//Zwrócić ostatnią kartę z talii.
//
//Podpowiedź:
//Talia kart ma się składać z 52 różnych obiektów Card o wszystkich możliwych kombinacjach pól,
// np. (A - Diamond, A - Clubs itd).
// Aby utworzyć taką kombinację, utwórz dwie niezależne listy - w pierwszej przechowuj możliwe figury,
// a w drugiej wartości. Następnie przechodząc pętlami, łącz je ze sobą i twórz obiekty.
public class Deck {
    public List<String> cardValues = List.of("A","2","3","4","5","6","7","8","9","10","J","Q","K");
    public List <String> cardSuits = List.of("Clubs","Diamonds","Hearts","Spades");



}
