package org.mentoring.exercises;

import org.mentoring.exercises.exercise4.Bus;
import org.mentoring.exercises.exercise4.Depot;
import org.mentoring.exercises.exercise4.Tram;
import org.mentoring.exercises.exercise4.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

    public static void ex4(){
        System.out.println("Treść:");
        System.out.println("Zaprojektuj z użyciem koncepcji dziedziczenia hierarchię klas opisujących pojazdy komunikacji miejskiej. \n" +
                "Wyraź w tej hierarchii następujące fakty:\n" +
                "\n" +
                "1. Wszystkie pojazdy komunikacji miejskiej (k. m.) są pojazdami.\n" +
                "2. Komunikacja miejska używa tramwajów i autobusów.\n" +
                "3. Pojazdy są garażowane w zajezdniach, odpowiednio tramwajowych i autobusowych.\n" +
                "4. Każdy pojazd zna swoją szybkość maksymalną.\n" +
                "5. Każdy pojazd k. m. zna swój numer.\n" +
                "6. Każdy pojazd k. m. zna swoją zajezdnię.\n" +
                "7. Każdy tramwaj jest zestawem 1 do 3 wagonów (i wie, z ilu wagonów się składa).\n" +
                "8. Każdy autobus wie, ile zużył paliwa w bieżącym miesiącu.\n" +
                "9. Każda zajezdnia wie, jakie pojazdy do niej należą.\n" +
                "10. Każda zajezdnia ma nazwę.\n" +
                "\n" +
                "Każdy pojazd i zajezdnia ma możliwość zwrócenia informacji o sobie:\n" +
                "dla pojazdu zawiera ona wszystkie informacje, które zna dany pojazd (np. numer, czy szybkość maksymalną). \n" +
                "Opis zajezdni to nazwa zajezdni, jej typ i opisy poszczególnych pojazdów. \n" +
                "Zajezdnia autobusowa podaje dodatkowo sumaryczne zużycie paliwa w bieżącym miesiącu, a tramwajowa ogólną liczbę wagonów.\n");
        System.out.println("Odpowiedź:");

        Bus bus1 = new Bus("bus1", "autobusowa", 80, 50);
        Bus bus2 = new Bus("bus2", "autobusowa", 90, 30);
        Bus bus3 = new Bus("bus3", "autobusowa", 80, 60);
        Bus bus4 = new Bus("bus4", "autobusowa", 80, 45);
        Tram tram1 = new Tram("tram1", "tramawjowa", 70, 2);
        Tram tram2 = new Tram("tram2", "tramawjowa", 60, 1);
        Tram tram3 = new Tram("tram3", "tramawjowa", 70, 3);
        Tram tram4 = new Tram("tram4", "tramawjowa", 70, 2);

        List <Vehicle> buses = new ArrayList<>();
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
