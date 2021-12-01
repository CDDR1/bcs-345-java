module com.mycompany.javafxlab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafxlab to javafx.fxml;
    exports com.mycompany.javafxlab;
}
