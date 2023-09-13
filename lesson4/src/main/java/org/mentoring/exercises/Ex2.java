package org.mentoring.exercises;

public class Ex2 {

    public static void ex2(){
        System.out.println("Treść:");
        System.out.println("Zastanów się i przedyskutuj z mentorem lub znajdź w zewnętrznych źródłach, " +
                "czym różni się zapis pętli for:\n" +
                "for(int i = 0; i < 10; i++) || for(int i =0; i < 10; ++i)\n");
        System.out.println("Odpowiedź:");
        System.out.println("for(int i = 0; i < 10; i++) || for(int i =0; i < 10; ++i)\n");
        System.out.println("Nie ma różnicy, ++i jest jednak złą praktyką");
        ex2Solution();
    }

    private static void ex2Solution(){
        for(int i = 0; i < 10; i++){
            int y = i+1;
            System.out.println("pętla i++: "+i + " y = " +y);
        };
        for(int i =0; i < 10; ++i) {
            int y = i+1;
            System.out.println("pętla ++i: "+i + " y = " +y);
        }

    }
}
