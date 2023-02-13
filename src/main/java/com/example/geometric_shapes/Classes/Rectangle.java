package com.example.geometric_shapes.Classes;
import com.example.geometric_shapes.Classes.Shape;
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getCircumference() {
        return 2 * (length + width);
    }
}
