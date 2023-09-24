package org.mentoring.exercises.exercise2;

public class Square extends Shape{

    public Square(int length) {
        super(length);
    }

    @Override
    public int area(int length) {
        int area = length*length;
        return area;
    }
}
