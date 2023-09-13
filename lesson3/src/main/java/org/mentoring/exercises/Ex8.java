package org.mentoring.exercises;

public class Ex8 {
    public static void ex8() {
        System.out.println("Treść");
        System.out.println("Wskaż instrukcje warunkowe, w których warunek będzie prawdą. " +
                "Jakim efektem zakończy się każda z operacji?\n");
        System.out.println("Odpowiedź:");
        System.out.println("int value = 14;\n" +
                "if(value > 0 && value < 20){\n" +
                "    System.out.println(\"OK!\");\n" +
                "} -> \"OK!\"\n\n" +
                "int value = 99;\n" +
                "String isEven = value % 2 == 0 ? \"parzysta\" : \"nieparzysta\"; -> \"nieparzysta\"\n\n" +
                "char letter_k = 'k', letter_j = 'j';\n" +
                "if(letter_k > letter_j){\n" + //ASCII k=107 ; j =106
                "    System.out.println(\"YES\");\n" +
                "}\n" +
                "else{\n" +
                "    System.out.println(\"NO!\");\n" +
                "} -> \"YES\"");
    }
}
