package org.mentoring.exercises.exercise6;

public class Student extends Person{

    private String studentNumber;
    private double averageMark;

    public Student(String name, String phoneNumber, String emailAddress, String studentNumber, double averageMark) {
        super(name, phoneNumber, emailAddress);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public Student(String name, String phoneNumber, String emailAddress, Address address, String studentNumber, double averageMark) {
        super(name, phoneNumber, emailAddress, address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll(){
        System.out.println("Tu metoda....");
        return true;
    }
}
