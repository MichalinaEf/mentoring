package org.mentoring.exercises.exercise9;

import java.util.ArrayList;
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
    private List<String> cardValues = List.of("A","2","3","4","5","6","7","8","9","10","J","Q","K");
    private List <String> cardSuits = List.of("Clubs","Diamonds","Hearts","Spades");

    public List <Card> cards = new ArrayList<>();

    public List<Card> createCards (){
        int cardNumber =0;
        for (int i = 0; i < (cardSuits.size()-1); i++) {
            for (int j = 0; j < (cardValues.size()-1); j++) {
                String value = cardValues.get(i);
                String suit = cardSuits.get(j);
                Card card = new Card(value,suit);
                cards.add(cardNumber,card);
                cardNumber++;
            }
        }
        for (Card card: cards) {
            System.out.println(card);
        }
        return cards;
    }
}
