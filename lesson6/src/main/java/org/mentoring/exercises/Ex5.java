package org.mentoring.exercises;

import org.mentoring.exercises.exercise5.Vehicle;

public class Ex5 {

    public static void ex5(){
        System.out.println("Treść:");
        System.out.println("Stwórz klasę reprezentującą pojazd. Dodaj do niej pola określające maksymalną prędkość " +
                "\nobiektu oraz jego przebieg (który inicjalizowac na początku będziesz wartością 0). " +
                "\nDodaj do klasy metodę, która zwiększać będzie wartość pola przebiegu o przesłaną wartość typu float. " +
                "\nW klasie tej dodatkowo mają się znaleźć settery i gettery do każdego z pól.\n");
        System.out.println("Odpowiedź:");

        Vehicle vehicle = new Vehicle(160);
        System.out.println(vehicle);
        vehicle.setMileage(vehicle.getMileage());
        System.out.println(vehicle);
        vehicle.setMileage(vehicle.getMileage());
        System.out.println(vehicle);
    }
}
