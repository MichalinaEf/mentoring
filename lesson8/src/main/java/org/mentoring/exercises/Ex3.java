package org.mentoring.exercises;

public class Ex3 {

    public static void ex3(){
        System.out.println("Treść:");
        System.out.println("Znajdź błąd w poniższym fragmencie kodu " +
                "(zwróć również uwagę na poprawne rozmieszczenie klas w paczkach):\n");
        //public class Vehicle {
        //    private int noTires;
        //    private int noSeats;
        //    private String driverName;
        //
        //    Vehicle(int noTires, int noSeats, String driverName) {
        //        this.noTires = noTires;
        //        this.noSeats = noSeats;
        //        this.driverName = driverName;
        //    }
        //
        //    private void honk() {
        //        System.out.println("BEEEP");
        //    }
        //
        //    private void showDetails() {
        //        System.out.println("General vehicle details: ");
        //        System.out.println("No tires: " + this.noTires + ", no seats: " + this.noSeats + ", driver's name: " + this.driverName);
        //    }
        //}

        //public class Car extends Vehicle {
        //    Car(int noTires, int noSeats, String driverName) {
        //        super(noTires, noSeats, driverName);
        //    }
        //}

        //public class Main {
        //    public static void main(String... args) {
        //        Car bmw = Car(4, 4, "Johnny");
        //        bmw.honk();
        //    }
        //}
        System.out.println("Odpowiedź:");
        System.out.println("W podanym kodzie, użyto niewłaściwych specyfikatorów dostępu, zamiast specyfikatora lepiej" +
                "\nzastosować specyfikator protected lub public, w zależności od skturktury aplikacji i potrzeb.");
    }
}
