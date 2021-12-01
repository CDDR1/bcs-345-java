package com.mycompany.listviewlab;

import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PrimaryController {

    @FXML
    private ListView<String> listViewShows;
    
    @FXML 
    private TextField textFieldNewShowName;
       
    
    public void initialize() {
        ObservableList<String> items = listViewShows.getItems();
        items.add("What we do in the shadows");
        items.add("Superstore");
    }
    
    @FXML
    private void handleAddNewShow() {
        String newShowName = this.textFieldNewShowName.getText();
        ObservableList<String> items = listViewShows.getItems();
        items.add(newShowName);
        this.textFieldNewShowName.setText("");
    }
}
