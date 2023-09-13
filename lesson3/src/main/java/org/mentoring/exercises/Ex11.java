package org.mentoring.exercises;

public class Ex11 {
    public static void ex11(){
        System.out.println("Treść");
        System.out.println("Znajdź błąd w poniższym zapisie switch case.\n");
        System.out.println("Odpowiedź:");
        System.out.println("brakuje deklaracji i inicjalizacji zmiennej value oraz break po każdym case");
        ex11Solution();
    }

    private static void ex11Solution(){
        int value = 69;
        switch(value){case 7:
            case 777:
                System.out.println("Lucky number");
                break;
            case 13:
                System.out.println("Unlucky number");
                break;
            case 69:
                System.out.println("Bad joke number");
                break;
            case 666:
                System.out.println("Evil number");
                break;
            default:
                System.out.println("Standard number");
        }

    }
}
