package com.example.geometric_shapes.Classes;

public class Cube extends Cuboid{
    public Cube(){
    }
    public Cube(double side) {
        super(side,side,side);
    }

    public double getSide() {
        return super.getHeight();
    }
    public void setSide(double side) {
        super.setHeight(side);
        super.setWidth(side);
        super.setLength(side);
    }
}
