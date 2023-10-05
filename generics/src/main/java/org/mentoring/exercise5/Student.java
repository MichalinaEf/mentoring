package org.mentoring.exercise5;

public class Student <T>{

    private T name;
    private Habits habits;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public Habits getHabits() {
        return habits;
    }

    public void setHabits(Habits habits) {
        this.habits = habits;
    }

    public Student(T name, Habits habits) {
        this.name = name;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return name + " is " + habits.describe().toString();
    }
}
