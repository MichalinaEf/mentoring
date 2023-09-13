package org.mentoring.exercises;

import java.util.Scanner;

public class Ex7 {
    public static void ex7(){
        System.out.println("Treść");
        System.out.println("Jak zrefaktoryzujesz poniższy kod?\n");
        System.out.println("Odpowiedź:");
        System.out.println("");
        ex7Solution();
    }

    private static void ex7Solution(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your Zodiac sign: Aquarius, Pisces, Aries, Taurus, " +
                    "Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn");
            String s = sc.next();

            switch (s){
                case "Aquarius":
                    System.out.println("You're born between " + "20 Jan and 18 Feb");
                    break;
                case "Pisces" :
                    System.out.println("You're born between " + "19 Feb and 19 Mar");
                    break;
                case "Aries":
                    System.out.println("You're born between " + "21 Mar and 19 Apr");
                    break;
                case "Taurus":
                    System.out.println("You're born between " + "20 Apr and22 May");
                    break;
                case "Gemini":
                    System.out.println("You're born between " + "20 Apr and 22 May");
                    break;
                case "Cancer" :
                    System.out.println("You're born between " + "22 Jun and 22 Jul");
                    break;
                case "Leo":
                    System.out.println("You're born between " + "23 Jul and 22 Aug");
                    break;
                case "Virgo":
                    System.out.println("You're born between " + "24 Aug and 22 Sep");
                    break;
                case "Libra":
                    System.out.println("You're born between " + "23 Sep and 22 May");
                    break;
                case "Scorpio":
                    System.out.println("You're born between " + "23 Oct and 21 Nov");
                    break;
                case "Sagittarius":
                    System.out.println("You're born between " + "22 Nov and 21 Dec");
                    break;
                case "Capricorn":
                    System.out.println("You're born between " + "22 Dec and 19 Jan");
                    break;
                default:
                    System.out.println("Wrong data");
                }

            }
//            if (s.equals("Aquarius")) {
//                System.out.println("You're born between " + "20 Jan and 18 Feb");
//            } else if (s.equals("Pisces")) {
//                System.out.println("You're born between " + "19 Feb and 19 Mar");
//            } else if (s.equals("Aries")) {
//                System.out.println("You're born between " + "21 Mar and 19 Apr");
//            } else if (s.equals("Taurus")) {
//                System.out.println("You're born between " + "20 Apr and22 May");
//            } else if (s.equals("Gemini")) {
//                System.out.println("You're born between " + "20 Apr and 22 May");
//            } else if (s.equals("Cancer")) {
//                System.out.println("You're born between " + "22 Jun and 22 Jul");
//            } else if (s.equals("Leo")) {
//                System.out.println("You're born between " + "23 Jul and 22 Aug");
//            } else if (s.equals("Virgo")) {
//                System.out.println("You're born between " + "24 Aug and 22 Sep");
//            } else if (s.equals("Libra")) {
//                System.out.println("You're born between " + "23 Sep and 22 May");
//            } else if (s.equals("Scorpio")) {
//                System.out.println("You're born between " + "23 Oct and 21 Nov");
//            } else if (s.equals("Sagittarius")) {
//                System.out.println("You're born between " + "22 Nov and 21 Dec");
//            } else if (s.equals("Capricorn")) {
//                System.out.println("You're born between " + "22 Dec and 19 Jan");
//            }
    }


