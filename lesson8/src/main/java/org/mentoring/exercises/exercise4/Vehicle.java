package org.mentoring.exercises.exercise4;

public class Vehicle {

    private String idNumber;
    private int maxVelocity;

    private String depot;

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
    public String toString() {
        return "Numer pojazdu: " + idNumber + ", maksymalna prędkość: " + maxVelocity +"km/h, " + "należy do zajezdni : "
                + depot + "\n";
    }


}
