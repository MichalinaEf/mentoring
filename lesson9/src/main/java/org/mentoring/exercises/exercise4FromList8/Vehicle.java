package org.mentoring.exercises.exercise4FromList8;

public abstract class Vehicle {

    protected String idNumber;
    protected int maxVelocity;

    protected String depot;

    public Vehicle(String idNumber, String depot, int maxVelocity) {
        this.idNumber = idNumber;
        this.depot = depot;
        this.maxVelocity = maxVelocity;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    @Override
    public abstract String toString();


}
