package org.mentoring.exercises.exercise5;

import java.math.BigDecimal;
import java.util.List;

public class Wallet {

    private List<Securities> securities;

    public Wallet(List<Securities> securities) {
        this.securities = securities;
    }

    public List<Securities> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Securities> securities) {
        this.securities = securities;
    }

    public void step(){
        for (Securities instance:securities) {
            instance.step();
        }
    }

    public void walletValue(){
        BigDecimal walletValue = BigDecimal.valueOf(0);
        for (Securities instance: securities) {
            walletValue = walletValue.add(instance.getValue());
        }
        System.out.println("Wallet value = " + walletValue + " PLN");
    }
}
