package org.mentoring.exercises;

public class Ex5 {

    public static void ex5(){
        System.out.println("Treść:");
        System.out.println("Jakie wartości przechowywane są w tablicy 10-elementowej, którą zadeklarowaliśmy, " +
                "\nale nie dodaliśmy do niej jeszcze żadnych wartości? Rozpatrz tablice zarówno na typ " +
                "\nchar, int, String, double i float. \n");
        System.out.println("Odpowiedź:");
        System.out.println("char = znak null ('\\u0000'): " + '\u0000'+
                "\nString - null" +
                "\nint - 0" +
                "\ndouble - 0.0" +
                "\nfloat = 0.0");
    }
}
