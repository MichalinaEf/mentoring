package org.mentoring.exercises;

import org.mentoring.exercises.exercise12.Manager;
import org.mentoring.exercises.exercise12.Order;

public class Ex12 {

    public static void ex12(){
        System.out.println("Treść:");
        System.out.println("Zrób system, który obsługiwał będzie określone zamówienia. " +
                "\nW programie istnieć będą 2 klasy: Manager oraz Order. " +
                "'nW Managerze ma się znajdować mapa zamówień, w którym kluczem będzie obiekt zamówienia, " +
                "\na wartością jego ilość na stanie. " +
                "\nW klasie Order natomiast mają znajdować się takie pola jak: id, nazwa, cena. " +
                "\nFunkcjonalność programu to:" +
                "\n" +
                "- Dodawanie nowego zamówienia do mapy: jeżeli dodajemy obiekt, którego id znajduje się już w mapie, " +
                "\nto nie dodajemy do niej nowego wpisu, ale zwiększamy jego ilość.\n" +
                "\n- Dsuwanie zamówienia: zmniejszamy ilość o 1, " +
                "\nzastanów się jak obsłużyć sytuację gdy ilość będzie równa 0.\n");
        System.out.println("Odpowiedź:");


        Manager manager = new Manager();
        manager.orders.put(new Order(1, "butter", 4.5),5);
        manager.orders.put(new Order(2, "bread", 6.2),10);
        manager.orders.put(new Order(3, "cheese", 8.9),0);
        manager.orders.put(new Order(4, "milk", 3.8),22);
        manager.orders.put(new Order(5, "coffee", 32.5),3);

        manager.printMap();
        manager.addOrder();
        manager.deleteOrder();

    }
}
