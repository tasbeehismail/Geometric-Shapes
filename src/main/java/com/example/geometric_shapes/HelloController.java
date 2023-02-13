package com.example.geometric_shapes;

import com.example.geometric_shapes.Classes.*;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Objects;

public class HelloController {
    //*********************************Circle**********************************//
    public Label Circle_error;
    @FXML
    private TextField Circle_Radius;
    @FXML
    private Label Circle_Circumference;
    @FXML
    public Label Circle_Area;
    @FXML
    protected void circleCalculate() {
        // if user not fill the textFields -> print in error label "Enter..."
        if(Objects.equals(Circle_Radius.getText(),"")){
            Circle_error.setText("Please Enter Circle radius!");
        }
        // else get Radius then print Area & Circumference after create object from Circle
        else{
            Circle_error.setText("");
           double r = Double.parseDouble(Circle_Radius.getText());
           Circle c = new Circle(r);
           Circle_Area.setText(String.valueOf(c.getArea()));
           Circle_Circumference.setText(Double.toString(c.getCircumference()));
        }
    }
    //*********************************Cylinder**********************************//
    public Label Cylinder_error;
    public TextField Cylinder_radius;
    public TextField Cylinder_Height;
    public Label Cylinder_Area;
    public Label Cylinder_volume;

    @FXML
    protected void cylinderCalculate() {
        // if user not fill the textFields -> print in error label "Enter..."
        if(Objects.equals(Cylinder_radius.getText(),""))
            Cylinder_error.setText("Please Enter Cylinder radius!");
        else if(Objects.equals(Cylinder_Height.getText(),""))
            Cylinder_error.setText("Please Enter Cylinder height!");
        // else get Radius & Height then print Area & Volume after create object from Cylinder
        else{
            Cylinder_error.setText("");
            double r = Double.parseDouble(Cylinder_radius.getText());
            double h = Double.parseDouble(Cylinder_Height.getText());
            Cylinder c = new Cylinder(r, h);
            Cylinder_Area.setText(String.valueOf(c.getArea()));
            Cylinder_volume.setText(String.valueOf(c.getVolume()));
        }
    }
    //*********************************Square**********************************//
    public Label Square_error;
    public TextField Square_Side;
    public Label Square_Circumference;
    public Label Square_Area;
    @FXML
    protected void SquareCalculate() {
        // if user not fill the textFields -> print in error label "Enter..."
        if(Objects.equals(Square_Side.getText(),""))
            Square_error.setText("Please Enter Square side!");
        // else get Side then print Area & Circumference after create object from Square
        else{
            Square_error.setText("");
            double s = Double.parseDouble(Square_Side.getText());
            Square sq = new Square(s);
            Square_Area.setText(String.valueOf(sq.getArea()));
            Square_Circumference.setText(String.valueOf(sq.getCircumference()));
        }
    }
    //*********************************Cube**********************************//
    public Label Cube_error;
    public TextField Cube_Side;
    public Label Cube_Area;
    public Label Cube_Volume;
    @FXML
    protected void CubeCalculate() {
        // if user not fill the textFields -> print in error label "Enter..."
        if(Objects.equals(Cube_Side.getText(),""))
            Cube_error.setText("Please Enter Cube side!");
        // else get Side then print Area & Volume after create object from Cube
        else{
            Cube_error.setText("");
            double s = Double.parseDouble(Cube_Side.getText());
            Cube c = new Cube(s);
            Cube_Area.setText(String.valueOf(c.getArea()));
            Cube_Volume.setText(String.valueOf(c.getVolume()));
        }
    }
    //*********************************Rectangle**********************************//
    public Label Rectangle_error;
    public TextField Rectangle_Height;
    public TextField Rectangle_Width;
    public Label Rectangle_Circumference;
    public Label Rectangle_Area;
    @FXML
    protected void RectangleCalculate() {
        // if user not fill the textFields -> print in error label "Enter..."
        if(Objects.equals(Rectangle_Height.getText(),""))
            Rectangle_error.setText("Please Enter Rectangle height!");
        else if(Objects.equals(Rectangle_Width.getText(),""))
            Rectangle_error.setText("Please Enter Rectangle width!");
            // else get Side then print Area & Circumference after create object from Rectangle
        else{
            Rectangle_error.setText("");
            double w = Double.parseDouble(Rectangle_Width.getText());
            double l = Double.parseDouble(Rectangle_Height.getText());
            Rectangle r = new Rectangle(l,w);
            Rectangle_Area.setText(String.valueOf(r.getArea()));
            Rectangle_Circumference.setText(String.valueOf(r.getCircumference()));
        }
    }
    //*********************************Cuboid**********************************//
    public Label Cuboid_error;
    public TextField cuboid_width;
    public TextField cuboid_Height;
    public TextField cuboid_depth;
    public Label Cuboid_Area;
    public Label Cuboid_Volume;
    @FXML
    protected void CuboidCalculate() {
        // if user not fill the textFields -> print in error label "Enter..."
        if(Objects.equals(cuboid_Height.getText(),""))
            Cuboid_error.setText("Please Enter Cuboid height!");
        else if(Objects.equals(cuboid_width.getText(),""))
            Cuboid_error.setText("Please Enter Cuboid width!");
        else if(Objects.equals(cuboid_depth.getText(),""))
            Cuboid_error.setText("Please Enter Cuboid depth!");
            // else get Side then print Area & Circumference after create object from Rectangle
        else{
            Cuboid_error.setText("");
            double w = Double.parseDouble(cuboid_width.getText());
            double h = Double.parseDouble(cuboid_Height.getText());
            double l = Double.parseDouble(cuboid_depth.getText());
            Cuboid c = new Cuboid(l,w,h);
            Cuboid_Area.setText(String.valueOf(c.getArea()));
            Cuboid_Volume.setText(String.valueOf(c.getVolume()));
        }
    }
}