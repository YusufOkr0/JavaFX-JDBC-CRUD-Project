module com.onlineshop.JavaFX {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires java.management;


    opens com.onlineshop.JavaFX to javafx.fxml;
    exports com.onlineshop.JavaFX;
    exports com.onlineshop.JavaFX.controller;
    opens com.onlineshop.JavaFX.controller to javafx.fxml;
}