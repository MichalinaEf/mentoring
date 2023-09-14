package org.mentoring.exercises;

import java.util.Scanner;

public class Ex11 {

    public static void ex11() {
        System.out.println("Treść:");
        System.out.println("Twoim zadaniem jest złamać metodą brute-force " +
                "\n(https://pl.wikipedia.org/wiki/Atak_brute_force) " +
                "nsłabe hasło składające się z 4 znaków będących literami alfabetu łacińskiego " +
                "\n(litery zarówno małe jak i wielkie). " +
                "\nWygeneruj wszystkie możliwe kombinacje takiego hasła i wyświetl każdą z osobna.\n");
        System.out.println("Odpowiedź:");
        ex11Solution();

    }

    private static void ex11Solution() {

        String password = "aZlK";
        char charAt0 = 'a';
        char charAt1 = 'a';
        char charAt2 = 'a';
        char charAt3 = 'a';

        for (int i = 65; i < 123 ; i++) {
            // warunek aby wukluczyć znaki pomiędzy literami
            if (i > 90 && i < 97)
                continue;
            else {
                //warunek aby sprawdzić czy, znak jest taki zam, jak znak w haśle, jeżeli tak
                if ((char) i == password.charAt(0)) {
                    charAt0 = (char) i;
                    break;
                }
            }
            for (int j = 65; j < 123; j++) {
                if (j > 90 && j < 97)
                    continue;
                else {
                    if ((char) j == password.charAt(1)) {
                        charAt1 = (char) j;
                        break;
                    }
                }
                for (int k = 65; k < 123; k++) {
                    if (k > 90 && k < 97)
                        continue;
                    else {
                        if ((char) k == password.charAt(2)) {
                            charAt2 = (char) k;
                            break;
                        }
                    }
                    for (int l = 65; l < 123; l++) {
                        if (l > 90 && l < 97)
                            continue;
                        else {
                            if ((char) l == password.charAt(3)) {
                                charAt3 = (char) l;
                                break;
                            }

                        }
                    }
                }
            }
        }
        System.out.println(charAt0 + "" + charAt1 + "" + charAt2 + "" + charAt3);



        // A-Z 65-90 ; a-z 97-122
//        for (int i = 65; i < 123 ; i++) {
//            if(i>90 && i < 97)
//                continue;
//            for (int j = 65; j < 123; j++) {
//                if(j>90 && j<97)
//                    continue;
//                for (int k = 65; k < 123; k++) {
//                    if(k>90 && k<97)
//                        continue;
//                    for (int l = 65; l < 123; l++) {
//                        if(k>90 && k<97)
//                            continue;
//                        System.out.println((char) i + "" + (char) j + "" + (char) k + "" + (char) l);
//                    }
//                }
//            }
//        }
    }
}

