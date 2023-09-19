package org.mentoring.exercises.exercise5;

import java.util.Scanner;

//Stwórz klasę reprezentującą pojazd.
// Dodaj do niej pola określające maksymalną prędkość obiektu oraz jego przebieg
// (który inicjalizowac na początku będziesz wartością 0).
// Dodaj do klasy metodę, która zwiększać będzie wartość pola przebiegu o przesłaną wartość typu float.
// W klasie tej dodatkowo mają się znaleźć settery i gettery do każdego z pól.
public class Vehicle {

    private int maxVelocity;
    private float mileage;
    private static Scanner sc = new Scanner(System.in);

    public Vehicle(int maxVelocity) {
        this.maxVelocity = maxVelocity;
        this.mileage = 0.0f;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        System.out.println("Podaj przebyty dystans");
        int distance = sc.nextInt();
        sc.nextLine();
        this.mileage += distance;
    }

    @Override
    public String toString() {
        return "auto może poruszać się z maksymalną prędkością: " + maxVelocity + " km/h\nprzebieg auta: " + mileage + " km;";
    }
}
