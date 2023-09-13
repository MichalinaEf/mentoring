package org.mentoring.exercises;

public class Ex7 {
    public static void ex7(){
        System.out.println("Treść: ");
        System.out.println("Co przechowują katalogi: src/, .idea, out/?");

        System.out.println("Odpowiedź:");
        System.out.println(" .idea: przechowuje pliki konfiguracyjne związane z ustawieniami projektu w obrębie IDE. " +
                "Głównie znajdują się w nim zasoby o rozszerzeniu .xml oraz .html." +
                "\n" +
                "Out: jest katalogiem przechowującym wygenerowany kod bajtowy dla danych plików " +
                "(to są to pliki o rozszerzeniu .class)." +
                "\n" +
                "Src: to miejsce składowe naszych plików projektowych umieszczonych w obrębie paczki. " +
                "Jak widzisz, automatycznie wygenerowaną paczką jest już pl.javasolution, " +
                "w której znajduje się plik z kodem źródłowym - Main.java./n");
    }


}
