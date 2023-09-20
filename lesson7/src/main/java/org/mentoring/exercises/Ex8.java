package org.mentoring.exercises;

public class Ex8 {

    public static void ex8(){
        System.out.println("Treść:");
        System.out.println("Często wykorzystywaną strategią podczas tworzenia klas jest przechowywanie jednego obiektu " +
                "\nw drugim. Takie rozwiązanie nazywane jest kompozycją. " +
                "\nWyszukaj w zewnętrznych źródłach i dopytaj mentora, czego dotyczy tego pojęcie. " +
                "\nWskaż w poniższym kodzie, gdzie występuje kompozycja.\n");
        //public class Company {
        //    private String companyName;
        //    private Employee[] employees;
        //
        //    public Company(String companyName) {
        //        this.companyName = companyName;
        //        this.employees = new Employee[]{
        //                new Employee("John", "Brick", 10, "manager"),
        //                new Employee("Ann", "Smith", 5, "manager"),
        //                new Employee("Jasper", "Jonathan", 10, "programmer")
        //        };
        //    }
        //}

        //public class Employee {
        //    private String name, surname;
        //    private int seniority;
        //    private String role;
        //
        //    public Employee(String name, String surname, int seniority, String role) {
        //        this.name = name;
        //        this.surname = surname;
        //        this.seniority = seniority;
        //        this.role = role;
        //    }
        //}
        System.out.println("Odpowiedź:");
        System.out.println("Kompozycja, to jedna z podstawowych technik w programowaniu obiektowym," +
                "\n w której jeden obiekt jest przechowywany jako pole wewnątrz obiektu innej klasy." +
                "\nInnymi słowy kompozycja polega na tworzeniu bardziej złożonych struktur obiektowych poprzez " +
                "\nagregację (łączenie) prostszych obiektów." +
                "\nW podanym przykładzie kompozycję widać w klasie Company, gdzie jednym z pól jest pole klasy Employee");
    }
}
