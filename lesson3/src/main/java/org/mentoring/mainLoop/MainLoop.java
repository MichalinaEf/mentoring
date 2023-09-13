package org.mentoring.mainLoop;

import org.mentoring.exercises.*;

import java.util.Scanner;

public class MainLoop {
    static Scanner sc = new Scanner(System.in);
    private final static int NUMBER_OF_EXERCISES = 11;

    public static void main(String[] args) {
        int optionValue;
        do {
            printOptions();
            optionValue = sc.nextInt();
            switch (optionValue) {
                case 0:
                    exit();
                    break;
                case 1:
                    chooseExercise();
                    break;
                default:
                    System.out.println("Podałeś zły numer opcji");
            }
        } while (optionValue != 0);
    }

    private static void chooseExercise() {
        System.out.println("Wybierz zadanie:");
        int exerciseNumber = sc.nextInt();
        switch (exerciseNumber){
            case 1:
                Ex1.ex1();
                break;
            case 2:
                Ex2.ex2();
                Ex2.ex2Solution();
                break;
            case 3:
                Ex3.ex3();
                Ex3.ex3Solution();
                break;
            case 4:
                Ex4.ex4();
                Ex4.ex4Solution();
                break;
            case 5:
                Ex5.ex5();
                break;
            case 6:
                Ex6.ex6();
                break;
            case 7:
                Ex7.ex7();
                break;
            case 8:
                Ex8.ex8();
                break;
            case 9:
                Ex9.ex9();
                break;
            case 10:
                Ex10.ex10();
                break;
            case 11:
                Ex11.ex11();
                break;
            default:
                System.out.println("W tej lekcji było tylko " + NUMBER_OF_EXERCISES +" zadań");
        }
    }

    private static void exit() {
        System.out.println("Dzięki za sprawdzenie! :)");
        sc.close();
    }

    private static void printOptions() {
        System.out.println("Wybierz jedną z opcji:");
        for (Option option: Option.values()) {
            System.out.println(option.toString());
        }
    }

    private enum Option{
        EXIT(0,"Koniec"),
        PRINT_EXERCISE (1,"Sprawdź zadanie");

        private int value;
        private String description;

        Option(int value, String description) {
            this.value = value;
            this.description = description;
        }

        public int getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return description + ", wybierz: " + value;
        }
    }
}
