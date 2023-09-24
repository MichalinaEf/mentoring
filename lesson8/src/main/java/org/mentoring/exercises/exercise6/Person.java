package org.mentoring.exercises.exercise6;

public class Person {
    private String Name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;

    public Person(String name, String phoneNumber, String emailAddress) {
        Name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Person(String name, String phoneNumber, String emailAddress, Address address) {
        Name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void purchaseParkingPass(){
        System.out.println("Tutaj metoda...");
    }
}
