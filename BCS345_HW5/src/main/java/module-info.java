  module com.mycompany.bcs345_hw5 {
    requires com.google.gson;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bcs345_hw5 to javafx.fxml, com.google.gson;
    exports com.mycompany.bcs345_hw5;
}
