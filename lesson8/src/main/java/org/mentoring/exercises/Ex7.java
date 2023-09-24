package org.mentoring.exercises;

public class Ex7 {

    public static void ex7(){
        System.out.println("Treść:");
        System.out.println("Dlaczego metoda main musi być zdefiniowana jako statyczna?\n");
        System.out.println("Odpowiedź:");
        System.out.println("Dzięki static, nie ma potrzeby tworzenia instancji tej klasy.\n" +
                " Głównym powodem jest to, że metoda main jest wywoływana przez maszynę wirtualną Java (JVM) \n" +
                "bez utworzenia instancji klasy, w której jest zdefiniowana. Klasa zawierająca main jest załadowana \n" +
                "przez klasę ClassLoader, a metoda main jest wywoływana jako pierwsza, \n" +
                "jeszcze przed utworzeniem obiektu danej klasy. Dlatego musi być ona dostępna bez konieczności tworzenia instancji.\n" +
                "\n" +
                "\n Metoda main jest punktem wejścia do programu. Jest to miejsce, " +
                "\nod którego rozpoczyna się wykonywanie programu Java. Jeśli metoda main nie jest statyczna, \n" +
                "to wymagałoby to utworzenia instancji klasy zawierającej main przed jej wywołaniem, \n" +
                "co jest niemożliwe bez innych punktów wejścia." );
    }
}
