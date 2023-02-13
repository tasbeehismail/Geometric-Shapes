module com.example.geometric_shapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.geometric_shapes to javafx.fxml;
    exports com.example.geometric_shapes;
    exports com.example.geometric_shapes.Classes;
    opens com.example.geometric_shapes.Classes to javafx.fxml;
}