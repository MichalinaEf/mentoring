package org.mentoring.exercises.exercise5;

import java.math.BigDecimal;
import java.util.Random;

public class Stock extends Securities{

    public Stock(BigDecimal value, int id) {
        super(value, id);
    }

    @Override
    public void step() {
        Random generator = new Random();
        int interestValue = generator.nextInt(2);
        BigDecimal result = null;
        int percentage = 0;

        if(interestValue == 0){
            result = getValue().add(getValue().multiply(BigDecimal.valueOf(0.1)));
            percentage = 10;
        } else {
            result = getValue().subtract(getValue().multiply(BigDecimal.valueOf(0.1)));
            percentage = -10;
        }

        System.out.println("Percentage = " + percentage + "%, result for stock = " + result);
    }

}
