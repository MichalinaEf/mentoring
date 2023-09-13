package org.mentoring.exercises;

public class Ex10 {

    public static void ex10(){
        System.out.println("Treść");
        System.out.println("Jakim wynikiem zakończy się poniższa operacja?\nint bigValue = 2147483647;\n" +
                "System.out.println(bigValue + 1);");
        System.out.println("Odpowiedź:");
        System.out.println("To jest przypadek z listy, wartość zawinie do początku zakresu, czyli\n" +
                "–2147483648\n" +
                "Dzieje się tak, ponieważ zmiany wartości zmiennej mogą odbywać się w trakcie runtime-u programu.\n");
    }
}
