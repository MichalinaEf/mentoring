package org.mentoring.exercises.exercise4FromList8;

public class Tram extends Vehicle{

    private int carriage;

    public Tram(String idNumber, String depot, int maxVelocity, int carriage) {
        super(idNumber, depot, maxVelocity);
        this.carriage = carriage;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    @Override
    public String toString() {
        return "Numer pojazdu: " + getIdNumber() + ", maksymalna prędkość: " + getMaxVelocity() +"km/h, "
                +"w swoim składzie posiada " + carriage + "wagonów, należy do zajezdni : "
                + getDepot() + "\n";
    }
}
