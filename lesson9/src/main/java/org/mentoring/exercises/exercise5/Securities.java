package org.mentoring.exercises.exercise5;

import java.math.BigDecimal;

public abstract class Securities {

    private BigDecimal value;
    private int id;

    public Securities(BigDecimal value, int id) {
        this.value = value;
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void step();
}
