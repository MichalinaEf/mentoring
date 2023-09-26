package org.mentoring.exercises.exercise4FromList8;

public class Bus extends Vehicle{

    private int fuelUsage;


    public Bus(String idNumber, String depot, int maxVelocity, int fuelUsage) {
        super(idNumber, depot, maxVelocity);
        this.fuelUsage = fuelUsage;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    @Override
    public String toString() {
            return "Numer pojazdu: " + getIdNumber() + ", maksymalna prędkość: " + getMaxVelocity() +"km/h, "
                    +"w tym miesiącu zużył " + fuelUsage + "l paliwa, należy do zajezdni : "
                    + getDepot() + "\n";
    }
}
