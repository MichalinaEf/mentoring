package org.mentoring.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex18 {

    private static Scanner sc = new Scanner(System.in);
    public static void ex18(){
        System.out.println("Treść:");
        System.out.println("Zmodyfikuj kod z zadania 17 tak, aby możliwe było dodawanie i usuwanie \n" +
                "przez użytkownika informacji o nowych albumach do mapy. Program ma zawierać proste menu.\n");
        System.out.println("Odpowiedź:");
        ex18Solution();
    }

    private static void ex18Solution() {
        Map<String,String> albums = new HashMap<>();
        albums.put("The Sensual World", "Kate Bush");
        albums.put("Shaday", "Ofra Haza");
        albums.put("Achtung Baby", "U2");
        albums.put("Aion", "Dead Can Dance");
        albums.put("Invisible Touch", "Genesis");

        String menu =
                """
                        Wybierz opcję:
                        1 - wyświetl dostępne albumy;
                        2 - dodaj album
                        3 - zakończ
                        """;
        int option;
        do {
            System.out.println(menu);
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println(albums);
                    break;
                case 2:
                    addNewAlbum(albums);
                    break;
                case 3:
                    System.out.println("Koniec");
                    break;
            }

        }while (option != 3);
    }

    private static void addNewAlbum(Map<String, String> albums) {
        System.out.println("Podaj nazwę albumu");
        String nameOfTheAlbum = sc.nextLine();
        System.out.println("Podaj wykonawcę");
        String bandName = sc.nextLine();
        albums.put(nameOfTheAlbum,bandName);

    }
}
