package org.mentoring.exercises;

import java.util.Scanner;

public class Ex2 {
    public static void ex2(){
        System.out.println("Treść");
        System.out.println("Jaki jest problem z poniższym kodem?\n" +
                "import java.util.Scanner;\n" +
                "\n" +
                "public class Main {\n" +
                "    public static void main(String... args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.println(\"Type 3 custom words: \");\n" +
                "        String words = scanner.next();\n" +
                "    }\n" +
                "}");
        System.out.println("Odpowiedź:");
        System.out.println("Słowa można podać jednym ciągiem, przydałaby się pętla. \n" +
                "Słowo next, przyjmuje jedynie jedno słowo.\nPropozycja rozwiązania:\n");
    }

    public static void ex2Solution(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 3 custom words: ");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3= scanner.nextLine();
        System.out.println(word1 + ", " + word2 + ", " + word3);
    }
}
