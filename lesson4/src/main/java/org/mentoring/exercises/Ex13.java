package org.mentoring.exercises;

import java.util.Scanner;

public class Ex13 {

    public static void ex13(){
        System.out.println("Treść:");
        System.out.println("Wyświetl użytkownikowi następujące menu:\n" +
                "\n" +
                "Wyświetl ilość kursantów. \n" +
                "Wyświetl nazwę firmy.\n" +
                "Wyświetl rok założenia firmy.\n" +
                "Wyjdź.\n" +
                "\n" +
                "Po wybraniu opcji nr 1, na ekranie powinna wyświetlać się liczba: 70.\n" +
                "Po wybraniu opcji n 2, na ekranie powinna wyświetlić się nazwa: “Devs-Mentoring.pl”.\n" +
                "Po wybraniu opcji nr 3, na ekranie powinien wyświetlić się rok 2021.\n" +
                "Ostatnia opcja natomiast ma przerywać działanie programu.\n" +
                "\n" +
                "Menu ma działać w oparciu o wybrany rodzaj pętli i ma wyświetlać userowi możliwe do wybrania wybory, " +
                "\ndopóki nie wybierze opcji nr 4. \n");
        System.out.println("Odpwiedź:");
        ex13Solution();

    }

    private static void ex13Solution() {
        Scanner sc = new Scanner(System.in);
        String text = """
                Wybierz opcję:
                1 -> Wyświetl ilość kursantów;
                2 -> Wyświetl nazwę firmy;
                3 -> Wyświetl rok założenia firmy;
                4 -> Wyjdź
                """;



        int option;
        do{
            System.out.print(text);
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println(70);
                    break;
                case 2 :
                    System.out.println("Devs-Mentoring.pl");
                    break;
                case 3:
                    System.out.println(2021);
                    break;
                case 4:
                    System.out.println("Koniec programu.");
                    //sc.close();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, spróbuj jeszcze raz.");
            }
        } while (option!=4);

    }

}
