package org.mentoring.exercises;

import org.mentoring.exercises.exercise4.CalculationSystem;
import org.mentoring.exercises.exercise4.Calculator;

public class Ex4 {

    public static void ex4(){
        System.out.println("Treść:");
        System.out.println("Stwórz interfejs Calculator, w którym umieścisz sygnaturę metod: \n" +
                "int substract(int a, int b) \n" +
                "int add(int a, int b) \n" +
                "int multiply(int a, int b) \n" +
                "double divide(int a, int b). \n" +
                "Utwórz następnie klasę CalculationSystem, która będzie przyjmowała do konstruktora \n" +
                "obiekt powyższej klasy - przekaż do niej anonimową implementację interfejsu z odpowiednio zdefiniowanymi metodami.\n" +
                "\n" +
                "CalculationSystem będzie posiadała metodę performCalculations(...)  \n" +
                "która wywoła i wyświetli wszystkie operacje Calulator-a. ");
        System.out.println("Odpowiedź:");

        CalculationSystem calculationSystem = new CalculationSystem(new Calculator() {
            @Override
            public int subtract(int a, int b) {
                return a - b;
            }

            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int multiply(int a, int b) {
                return a * b;
            }

            @Override
            public double divide(int a, int b) {
                return a/b;
            }
        });

        System.out.println("a = 5; b = 2");
        calculationSystem.performCalculations(5,2);

    }
}
