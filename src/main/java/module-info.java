module com.mycompany.lab08 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.lab08 to javafx.fxml;
    exports com.mycompany.lab08;
}
