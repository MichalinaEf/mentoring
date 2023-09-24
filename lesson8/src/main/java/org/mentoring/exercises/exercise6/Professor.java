package org.mentoring.exercises.exercise6;

public class Professor extends Person{

    private double salary;

    public Professor(String name, String phoneNumber, String emailAddress, double salary) {
        super(name, phoneNumber, emailAddress);
        this.salary = salary;
    }

    public Professor(String name, String phoneNumber, String emailAddress, Address address, double salary) {
        super(name, phoneNumber, emailAddress, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
