module com.apps.myapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.apps.myapp to javafx.fxml;
}