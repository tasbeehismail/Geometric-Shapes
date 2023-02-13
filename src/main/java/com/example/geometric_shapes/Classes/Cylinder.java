package com.example.geometric_shapes.Classes;

public class Cylinder extends Circle{
    protected double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return(super.getCircumference()*height)+(2*super.getArea());
    }
    public double getVolume() {
        return super.getArea()*height;
    }
}
