package org.mentoring.exercises.exercise9;

//Stwórz klasę Multiplication z metodą execute,
// której zadaniem będzie obliczanie iloczynu wartości i będzie dostosowana
// pod działanie na float-ach, int-ach i argumentach typu double. Wykorzystaj przeładowanie metody.

public class Multiplication {

    public void execute(int a, int b){
        int result = a*b;
        System.out.println("Ta metoda to wersja dla int: int a* int b = " + result);
    }

    public void execute(float x, float y){
        float result = x*y;
        System.out.println("Ta metoda to wersja dla float: float x * float y = " + result);
    }

    public void execute(double a, double b){
        double result = a*b;
        System.out.println("Ta metoda to wersja dla double: double a* double b = " + result);
    }
}
