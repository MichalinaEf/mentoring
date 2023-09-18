package org.mentoring.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex17 {

    public static void ex17(){
        System.out.println("Treść:");
        System.out.println("Wprowadź poniższą mapę do programu. Program ma działać, tak jak poniżej:\n" +
                "wyświetla wszystkie klucze na konsoli (tzn. nazwy wszystkich albumów),\n" +
                "pobiera od użytkownika łańcuch i sprawdza czy odpowiada on kluczowi ze słownika. \n" +
                "Jeśli tak, to wyświetlany jest odpowiedni komunikat, np.: \"Wykonawcą albumu \"Achtung baby\" jest “U2\".\n" +
                "\n" +
                "W przeciwnym razie wyświetlany jest komunikat: \"Brak danych\".\n" +
                "Dane do umieszczenia w mapie:\n" +
                "'The Sensual World' : 'Kate Bush', \n" +
                "'Shaday' : 'Ofra Haza', \n" +
                "'Achtung Baby' : 'U2', \n" +
                "'Aion' : 'Dead Can Dance', \n" +
                "'Invisible Touch' : 'Genesis'}\n");
        System.out.println("Odpowiedź:");
        ex17Solution();
    }

    private static void ex17Solution() {
        Map<String,String> albums = new HashMap<>();
        albums.put("The Sensual World","Kate Bush");
        albums.put("Shaday","Ofra Haza");
        albums.put("Achtung Baby","U2");
        albums.put("Aion","Dead Can Dance");
        albums.put("Invisible Touch","Genesis");

        System.out.println(albums.keySet());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the album");
        String enteredString = sc.nextLine();
        containsAlbum(albums,enteredString);
    }

    private static void containsAlbum(Map<String, String> albums, String enteredString) {
        if(albums.containsKey(enteredString)){
            System.out.println("Wykonawcą albumu " + enteredString + " jest: " + albums.get(enteredString));
        } else
            System.out.println("Brak danych");
    }
}
