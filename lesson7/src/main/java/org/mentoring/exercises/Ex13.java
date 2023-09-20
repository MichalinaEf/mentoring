package org.mentoring.exercises;

public class Ex13 {

    public static void ex13(){
        System.out.println("Treść:");
        System.out.println("Czym jest konstruktor kopiujący?\n");
        System.out.println("Odpowiedź:");
        System.out.println("Konstruktor kopiujący (copy constructor) to specjalny rodzaj konstruktora " +
                "\nw językach programowania, w tym także w Javie, który jest używany do tworzenia nowego obiektu " +
                "\nna podstawie istniejącego obiektu tego samego typu. Konstruktor kopiujący jest wykorzystywany " +
                "\ndo głębokiego kopiowania danych z jednego obiektu do drugiego, " +
                "\nw efekcie czego otrzymujemy dwie niezależne kopie danych." +
                "\nPrzykład:" +
                "\nOsoba osoba1 = new Osoba(\"Jan\", \"Kowalski\");" +
                "\nOsoba osoba2 = new Osoba(osoba1);" +
                "\n w wyniku tego osoba2 = osoba1\n");
    }
}
