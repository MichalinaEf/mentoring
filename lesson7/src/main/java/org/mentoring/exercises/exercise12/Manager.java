package org.mentoring.exercises.exercise12;

import java.util.*;

public class Manager {




    public Map <Order,Integer> orders = new HashMap<>();
    public Scanner sc = new Scanner(System.in);

    Order order1 = new Order(1, "masło", 4.5);
    Order order2 = new Order(2, "bułki", 6.2);
    Order order3 = new Order(3, "ser", 8.9);
    Order order4 = new Order(4, "mleko", 3.8);
    Order order5 = new Order(5, "kawa", 32.5);


    public void printMap(){
        System.out.println("Zawartość mapy:");
        orders.forEach ((order,quantity)-> System.out.println(order + "; " + quantity + "szt;"));
    }


    public void addOrder(){
        Order order = createOrder();

        System.out.println("Podaj ilość produktów w zamówieniu");
        int quantity = sc.nextInt();
        sc.nextLine();

        if (orders.containsKey(order)) {
            int currentQuantity = orders.get(order);
            orders.put(order,(currentQuantity+quantity));
            System.out.println("Zwiększone ilość zamówienia " + order.getName());
        } else {
            orders.put(order, quantity);
            System.out.println("Dodano " + order.getName() + "do mapy");
        }
        printMap();
    }

    private Order createOrder() {
        System.out.println("Podaj id produktu");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj nazwę produktu");
        String name = sc.nextLine();
        System.out.println("Podaj cenę produktu (format dla ceny: 00,00)");
        double price = sc.nextDouble();
        sc.nextLine();
        return new Order(id,name,price);
    }

    public void deleteOrder(){
        System.out.println("Podaj id zamówienia do usunięcia:");
        int id = sc.nextInt();
        Order order;
        sc.nextLine();

        if(orders.isEmpty()){
            System.out.println("Nie ma żadnych zamówień do usunięcia");
            printMap();
            return;
        }
        for(Order key : orders.keySet()) {
            if (key.getId() == id) {
                int currentQuantity = orders.get(key);
                if (currentQuantity <= 0) {
                    System.out.println("Ilość zamówień równa 0, nie można nic więcej usunąć");
                } else {
                    orders.put(key,currentQuantity-1);
                    System.out.println("Usunięto jedno zamówienie z zamówienia :" + key);
                }
                printMap();
                return;
            }
        }

        System.out.println("Nie znaleziono zamówienia o podanym ID");
        printMap();
    }

}
