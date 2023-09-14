package org.mentoring.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex14 {

    public static void ex14(){
        System.out.println("Treść:");
        System.out.println("Napisz program, który wczytuje od użytkownika liczbę oznaczającą, ile należy wylosować " +
                "liczb z zakresu -100 do 100. \n" +
                "Następnie dokonuje obliczeń stosunku liczby wylosowanych liczb dodatnich (bez zera) " +
                "do liczb ujemnych oraz wyświetla najmniejszą i największą znalezioną liczbę " +
                "(użytkownik musi podać przynajmniej 2 liczby). \n" +
                "Wynikiem działania programu ma być informacja na temat wszystkich trzech wartości. \n" +
                "\n" +
                "Przykład dla liczby podanej przez użytkownika 3, następuje losowanie, np:\n" +
                "11 -5 93\n" +
                "W wyniku na ekran zostaje wyświetlona informacja:\n" +
                "2 -5 93\n" +
                "// bo stosunek 2 (2 liczby dodatnie / 1 liczba ujemna) oraz min: -5, max: 93\n" +
                "\n" +
                "Podpowiedź:\n" +
                "Poniżej post ukazujący, jak losować liczby z określonego przedziału: " +
                "https://forum.pasja-informatyki.pl/2549/generowanie-pseudo-losowych-liczb-z-zadanego-przedzialu \n" +
                "\n" +
                "Przy okazji - znajdź informacje, czym są liczby pseudolosowe w Javie.\n");
        System.out.println("Odpowiedź:");
        ex14Solution();

    }

    private static void ex14Solution() {
        Scanner sc = new Scanner(System.in);
        int counter;
        int countPositive=0;
        int countNegative=0;
        double posNegRatio = 0;
        int minValue = 0;
        int maxValue=0;

        do{
            System.out.println("Wprowadź liczbę całkowitą, dodatnią, większą od 2");
            counter = sc.nextInt();
        } while (counter<2);

        System.out.print("wylosowane liczby:");
        for (int i = 0; i < counter; i++) {
            Random random = new Random();
            int randomNumb = random.nextInt(201)-100;
            System.out.print(randomNumb + ", ");
            if(randomNumb>0){
                countPositive++;
            } else if (randomNumb<0) {
                countNegative++;
            }
            if(randomNumb>maxValue)
                maxValue=randomNumb;
            if(randomNumb<minValue)
                minValue=randomNumb;
        }


        posNegRatio = (double)countPositive/countNegative;
        System.out.println();
        System.out.println(posNegRatio + " " + minValue +" " + maxValue);
//        System.out.println("Stosunek liczb dodatnich do liczb ujemnych: " + posNegRatio);
//        System.out.println("Minimalna: " + minValue);
//        System.out.println("Maksymalna: " + maxValue);

    }


}
