package org.mentoring.exercises;

public class Ex8 {

    public static void ex8(){
        System.out.println("Treść:");
        System.out.println("Stwórz klasę MessagingSystem, której zadaniem będzie wyświetlanie logów.\n" +
                "System będzie wyświetlał logi ostrzegawcze i informacyjne, w tym celu stwórz klasy Warning oraz Info.\n" +
                "Każda z tych klas będzie przechowywać zahardkodowanego String-a:\n" +
                "Warning: “Watch out! Warning here!”\n" +
                "Info: “Listen carefully. We have some information regarding …”\n" +
                "oraz licznik przechowujący informację, ile razy dana wiadomość została zalogowana.\n" +
                "\n" +
                "Komunikaty mają wyświetlać się w momencie, gdy wywołamy metodę execute() z ww. klas. \n" +
                "Metoda ta będzie wywoływana z poziomu MessagingSystem za pomocą metod showWarning() \n" +
                "oraz showInfo() dla odpowiedniej klasy (sugeruj się nazwami metod podczas implementacji).\n" +
                "\n" +
                "Przy każdym wywołaniu metod show..() wyświetl również informacje ile razy sumarycznie\n" +
                " była użyta metoda execute().\n" +
                "\n" +
                "Zaimplementuj powyższą funkcjonalność bez instancjonowania klas Info i Warning.  \n");
        System.out.println("Odpowiedź:");
        System.out.println("");
    }
}
