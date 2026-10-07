module com.example.democratsjavafxdb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.democratsjavafxdb to javafx.fxml;
    exports com.example.democratsjavafxdb;
}