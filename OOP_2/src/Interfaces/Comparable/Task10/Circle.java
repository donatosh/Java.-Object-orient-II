package Interfaces.Comparable.Task10;

import static java.lang.Math.pow;

public class Circle extends GeometricObject {
    private double radius;
    private double diameter;
    private double area;
    private static final double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }
    @Override
    public double getArea(){
        return pi * pow(this.radius, 2);
    }

}
