package com.example.geometric_shapes.Classes;

public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide(){
        return getWidth();
    }
}
