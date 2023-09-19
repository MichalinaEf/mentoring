package org.mentoring.exercises.exercise4;
//Stwórz klasę reprezentującą studenta.
// Cechy studenta określaj z poziomu odpowiednich metod.
// Dodaj do klasy metodę wyświetlającą informacje o danym obiekcie.
// Pamiętaj o odpowiednim podziale struktury projektu (utwórz nowy plik na klasę).

public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String indexNumber;

    public Student(String firstName, String lastName, int yearOfBirth, String indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.indexNumber = indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + ",\n" +
                "rocznik: " + yearOfBirth + ",\n" +
                "nr indeksu: " + indexNumber + ";";
    }
}
