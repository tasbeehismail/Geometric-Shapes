package com.example.geometric_shapes.Classes;

public class Cuboid extends Rectangle{
    private double height;
    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public Cuboid() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    ///change getArea to super.getArea
    public double getVolume() {
        return super.getArea()*height;
    }
    @Override
    public double getArea() {
        return (super.getArea()+(getLength()*height)+(getWidth()*height))*2;
    }
}
