module com.apps.myapp1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.apps.myapp1 to javafx.fxml;
    exports com.apps.myapp1;
}