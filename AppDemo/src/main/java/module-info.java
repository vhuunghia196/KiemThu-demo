module com.mycompany.appdemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.appdemo to javafx.fxml;
    exports com.mycompany.appdemo;
}
