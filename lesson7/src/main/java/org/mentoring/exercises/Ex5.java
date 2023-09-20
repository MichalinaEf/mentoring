package org.mentoring.exercises;

public class Ex5 {

    public static void ex5(){
        System.out.println("Treść:");
        System.out.println("Czy klasa może nie mieć konstruktora?\n");
        System.out.println("Odpowiedź:");
        System.out.println("klasa może nie mieć własnego konstruktora, wtedy kompilator dostarczy konstruktor domyślny (bezargumentowy). " +
                "\nJednak w momencie zdefiniowania własnego konstruktora, " +
                "\nkonstruktor domyślny nie jest już dostarczany automatycznie.");
    }
}
