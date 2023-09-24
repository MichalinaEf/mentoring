package org.mentoring.exercises.exercise2;

public class Shape {

    private int length;

    public int getLength() {
        return length;
    }

    private void setLength(int length) {
        this.length = length;
    }

    protected Shape(int length) {
        this.length = length;
    }

    protected int area(int length){
        return 0;
    }
}
