module com.mycompany.progettoingsoftware2026 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.progettoingsoftware2026 to javafx.fxml;
    exports com.mycompany.progettoingsoftware2026;
}
