package org.mentoring.exercises.exercise4;

public class CalculationSystem {

    private final Calculator calculator;


    public CalculationSystem(Calculator calculator) {
        this.calculator = calculator;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void performCalculations(int a, int b){
        int addResult = calculator.add(a, b);
        int subtractResult = calculator.subtract(a,b);
        int multiplyResult = calculator.multiply(a,b);
        double divideResult = calculator.divide(a,b);
        System.out.println("Add result = " + addResult + ", substract result = " + subtractResult +
                ", multiply result = " + multiplyResult + ", divide result = " + divideResult);
    }
}
