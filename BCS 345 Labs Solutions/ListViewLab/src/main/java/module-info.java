module com.mycompany.listviewlab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.listviewlab to javafx.fxml;
    exports com.mycompany.listviewlab;
}
