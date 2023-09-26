package org.mentoring.exercises.exercise5;

import java.math.BigDecimal;

public class Debenture extends Securities{

    private BigDecimal interest;


    public Debenture(BigDecimal value, int id, BigDecimal interest) {
        super(value, id);
        this.interest = interest;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    @Override
    public void step() {
        BigDecimal result = getValue().add(interest);
        System.out.println("Step for debenture = " + result);
    }
}
