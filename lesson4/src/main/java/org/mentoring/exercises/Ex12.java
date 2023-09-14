package org.mentoring.exercises;

public class Ex12 {
    public static void ex12(){
        System.out.println("Treść:");
        System.out.println("Zastanów się, jak można zrealizować nieskończone pętle za pomocą " +
                "\ntrzech poznanych rodzajów pętli: for, while, do while.\n");
        System.out.println("Odpowiedź:");
        System.out.println("for (;;) {\n}" + "\nwhile (true) {\n}" + "do {\n} while (true);"+
                "\n\nWszystkie trzy powyższe przykłady tworzą nieskończone pętle, które będą działać bez końca, " +
                "\ndopóki nie zostaną przerwane zewnętrznymi czynnikami, " +
                "\ntakimi jak zatrzymanie programu lub przerwanie pętli za pomocą instrukcji break.\n" +
                "\n" +
                "Jest to jednak potencjalnie niebezpieczne i może prowadzić do zacięcia programu lub problemów " +
                "\nz wydajnością, dlatego należy używać ich ostrożnie i upewnić się, " +
                "\nże istnieje sposób na przerwanie takiej pętli w odpowiednich warunkach.");

    }
}
