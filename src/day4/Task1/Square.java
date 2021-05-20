package day4.Task1;

import day4.Task4.Shape;

public class Square extends Shape {
    @Override
    protected double getPerimeter(double radius) {
        return radius*4;
    }

    @Override
    protected double getArea(double radius) {
        return radius * radius;
    }
}
