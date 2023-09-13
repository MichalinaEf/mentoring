package org.mentoring.exercises;

import java.util.Scanner;

public class Ex3 {
    public static void ex3() {
        System.out.println("Treść");
        System.out.println("Napisz program, który odczyta od użytkownika takie dane jak:\n" +
                "Imię\n" +
                "Nazwisko\n" +
                "Wiek\n" +
                "Wzrost\n" +
                "A następnie na podstawie pobranych informacji wyświetli komunikat: “Hello <Twoje imię i nazwisko>! " +
                "Thank you for joining us. You are <Twój wiek> years old and your height is <Twój wzrost>”.\n");
        System.out.println("Odpowiedź:");
    }

    public static void ex3Solution(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your first name");
        String name = sc.nextLine();
        System.out.println("Give your last name");
        String surname = sc.nextLine();
        System.out.println("Give your age");
        int age = sc.nextInt();
        System.out.println("Give your height");
        int height = sc.nextInt();
        System.out.println("Hello "+ name + " " + surname +"! \nThank you for joining us. \nYou are " + age +
                " years old and your height is " + height + " cm\n");
    }
}
