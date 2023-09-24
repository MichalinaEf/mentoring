package org.mentoring.exercises.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Depot {
    private String name;
    private String type;
    private List<Vehicle> vehicles;

    public Depot(String name, String type, List<Vehicle> vehicles) {
        this.name = name;
        this.type = type;
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int fuelUsageTotal(List<Vehicle> vehicles){
        int fuelUsageTotal = 0;
        for (Vehicle bus : vehicles){
            if(bus instanceof Bus){
                fuelUsageTotal += ((Bus) bus).getFuelUsage();
            }
        }
        return fuelUsageTotal;
    }

    public int carriageTotal(List<Vehicle> vehicles){
        int carriageTotal = 0;
        for(Vehicle tram : vehicles){
            if (tram instanceof Tram){
                carriageTotal += ((Tram) tram).getCarriage();
            }
        }
        return carriageTotal;
    }

    public String toString() {
        if (type.equals("autobusowa"))
            return "Zajezdnia " + type + " " + name + ", pojazdy należące do zajedni: " +
                    "\nOpis poszczególnych pojazdów: \n" + vehicles.toString() + ", zużycie paliwa za bieżący miesiąc: " +
                    fuelUsageTotal(vehicles) + " l;";
         else if (type.equals("tramwajowa"))
            return "Zajezdnia " + type + " " + name + ", pojazdy należące do zajedni: " +
                    "\nOpis poszczególnych pojazdów: \n" + vehicles.toString() + ", Całkowita ilość wagonów: " +
                    carriageTotal(vehicles) + " szt;";
         else
             return null;
    }


}
