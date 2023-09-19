package org.mentoring.exercises;

public class Ex10 {

    public static void ex10(){
        System.out.println("Treść:");
        System.out.println("Czym jest varargs w Javie?\n" +
                "Czym różnią się poniższe zapisy?\n" +
                "\n" +
                "void calc(int... values){\n" +
                "}\n" +
                "vs\n" +
                "void calc(int[] values){\n" +
                "}\n");
        System.out.println("Odpowiedź:");
        System.out.println("Varargs (variable-length argument lists) w Javie to mechanizm, " +
                "\nktóry pozwala na przekazywanie zmiennej liczby argumentów do metody. " +
                "\nJest to skrócony zapis, który sprawia, że kod jest bardziej elastyczny i czytelny. " +
                "\nW Javie varargs jest oznaczany trzema kropkami \"...\" po typie argumentu w deklaracji metody." +
                "\n" +
                "\nRóżnica między int... values a int[] values:\n" +
                "int... values: To deklaracja varargs. Oznacza, że metoda calc może przyjąć dowolną liczbę argumentów typu int. " +
                "\nWywołanie tej metody może wyglądać na przykład tak: calc(1, 2, 3) lub calc(4, 5). " +
                "\nWewnątrz metody values traktowane są jako tablica.\n" +
                "int[] values: To deklaracja tablicy. Oznacza, że metoda calc przyjmuje dokładnie jeden argument, " +
                "\nktóry jest tablicą typu int. Wywołanie tej metody wymaga przekazania jednej tablicy, " +
                "\nna przykład calc(new int[]{1, 2, 3}).\n" +
                "Podsumowując, varargs (int...) umożliwia przekazywanie dowolnej liczby argumentów jako pojedynczego parametru metody, " +
                "\npodczas gdy int[] wymaga przekazania jednej tablicy jako argumentu.\n");
    }
}
