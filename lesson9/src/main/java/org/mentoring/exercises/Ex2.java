package org.mentoring.exercises;

import org.mentoring.exercises.exercise4FromList8.Bus;
import org.mentoring.exercises.exercise4FromList8.Depot;
import org.mentoring.exercises.exercise4FromList8.Tram;
import org.mentoring.exercises.exercise4FromList8.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void ex2(){
        System.out.println("Treść:");
        System.out.println("Przemodeluj rozwiązanie zadania 4. z poprzedniego szkolenia na takie, " +
                "\nw którym wykorzystasz klasy abstrakcyjne (lub interfejsy).\n");
        System.out.println("Odpowiedź:");
        Bus bus1 = new Bus("bus1", "autobusowa", 80, 50);
        Bus bus2 = new Bus("bus2", "autobusowa", 90, 30);
        Bus bus3 = new Bus("bus3", "autobusowa", 80, 60);
        Bus bus4 = new Bus("bus4", "autobusowa", 80, 45);
        Tram tram1 = new Tram("tram1", "tramawjowa", 70, 2);
        Tram tram2 = new Tram("tram2", "tramawjowa", 60, 1);
        Tram tram3 = new Tram("tram3", "tramawjowa", 70, 3);
        Tram tram4 = new Tram("tram4", "tramawjowa", 70, 2);

        List<Vehicle> buses = new ArrayList<>();
        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);
        buses.add(bus4);

        List<Vehicle> trams = new ArrayList<>();
        trams.add(tram1);
        trams.add(tram2);
        trams.add(tram3);
        trams.add(tram4);

        Depot busDepot = new Depot("autobusowa", "autobusowa", buses);
        Depot tramDepot = new Depot("tramawjowa", "tramwajowa", trams);

        System.out.println(busDepot);
        System.out.println(tramDepot);
    }
}
