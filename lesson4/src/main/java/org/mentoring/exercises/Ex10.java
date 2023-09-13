package org.mentoring.exercises;

import java.util.Scanner;

public class Ex10 {

    public static void ex10(){
        System.out.println("Treść:");
        System.out.println("Zadeklaruj trzy zmienne - pierwszą przechowującą informację o startowym poziomie paliwa, " +
                "drugą określającą ilość astronautów na pokładzie, a trzecią mówiącą, na jakiej wysokości znajduje się rakieta.  \n" +
                "\n" +
                "Poproś użytkownika o podanie początkowego poziomu paliwa. " +
                "Użytkownik ma kontynuować czynność, dopóki nie poda poprawnej wartości " +
                "- mieszczącej się pomiędzy 5000 a 30000 litrów.\n" +
                "Stwórz drugą pętlę, która będzie prosić o użytkownika o podanie odpowiedniej " +
                "ilości astronautów znajdujących na pokładzie. Pętla ma walidować podaną liczbę - tak, " +
                "aby była dodatnia i nie większa niż 7.\n" +
                "Zasymuluj pętlą nr 3 lot statku kosmicznego. Kolejne iteracje mają zmniejszać " +
                "obecny poziom paliwa o określoną wartość. " +
                "Zużycie paliwa co 100 km zależy od ilości astronautów na pokładzie i jest równe: " +
                "300L + 100 * ilosc_astronautow. \n" +
                "\n" +
                "Pętla więc ma uruchamiać się co 100 km i wykonać tyle iteracji, " +
                "na ile wystarczy paliwa. Co każdą iterację ma wyświetlać się aktualnie " +
                "przebyty dystans przez statek kosmiczny. \n" +
                "\n" +
                "Po wykonaniu się pętli, powinien wyświetlić się komunikat: " +
                "“Statek kosmiczny dotarł do orbity”, jeżeli przebyta odległość jest większa niż 2000 km " +
                "lub w przypadku mniejszej odległości - “Statek kosmiczny nie dotarł do orbity”.\n");
        System.out.println("Odpowiedź:");
        ex10Solution();
    }

    private static void ex10Solution() {
        int initFuelLevel;
        int numOfAstronauts;
        int rocketAltitude;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter initial fuel level");
            initFuelLevel = sc.nextInt();
        }
        while (initFuelLevel > 4999 && initFuelLevel < 30001);



        do{
            System.out.println("Enter number of astronauts");
            numOfAstronauts = sc.nextInt();}
        while (numOfAstronauts>0 && numOfAstronauts<=7);

        int fuelLevel = initFuelLevel;
        rocketAltitude = 0;
        while (fuelLevel>0){
            fuelLevel -= (300 + 100*numOfAstronauts);
            rocketAltitude +=100;
            System.out.println(rocketAltitude);
        }
        if(rocketAltitude>2000){
            System.out.println("The spacecraft has reached orbit");
        } else
            System.out.println("The spacecraft has not reached orbit");
    }


}
