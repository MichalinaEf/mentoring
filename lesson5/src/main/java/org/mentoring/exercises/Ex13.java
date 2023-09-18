package org.mentoring.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex13 {

    public static void ex13(){
        System.out.println("Treść:");
        System.out.println("Napisz program, który będzie pobierał od użytkownika dowolne wyrazy, " +
                "\ndopóki nie wprowadzi on słowa “STOP”. " +
                "\nPo podaniu każdego ze słów, ma być ono umieszczane w obiekcie typu ArrayList. " +
                "\nPo tak przeprowadzonym procesie umieszczania kolejnych elementów, " +
                "\nprogram ma wyświetlać długość utworzonej list wraz z informacją, " +
                "\njaki jest jej pierwszy, ostatni i środkowy element.\n");
        System.out.println("Odpowiedź:");
        ex13Solution();
    }

    private static void ex13Solution() {

        String word = "";
        List<String> arr = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj dowolny wyraz lub STOP aby zakończyć");
            word = sc.next();
            arr.add(word);
        } while (!(word.equals("STOP")));

//        9/2 = 4
//        10/2 ->4 i 5
//        0 1 2 3 4 5 6 7 8

        int lengthOfArr = arr.size();
        System.out.println("Długość list: " + lengthOfArr);
        String index0 = arr.get(0);
        System.out.println("Pierwsze słowo: " + index0);
        System.out.print("środkowe słowo lub dwa słowa, jeżeli długość tablicy jest parzysta: ");
        if(lengthOfArr%2 != 0){
            System.out.println(arr.get((lengthOfArr-1)/2));
        } else {
            System.out.println(arr.get(((lengthOfArr) / 2)) +", "+ arr.get(((lengthOfArr) / 2) - 1));
        }

        String lastIndex = arr.get(lengthOfArr-1);
        System.out.println("Ostatnie słowo: " + lastIndex);
    }
}
