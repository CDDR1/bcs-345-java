package com.mycompany.javafxlab;

import java.io.File;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class PrimaryController {

    @FXML
    private TextField textFieldMessage;
    
//    ClassGrades = new ClassGrades();
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
      
    
    @FXML 
    private void handleShowMessage() {
        String s = "Real Madrid SUCKS!";
        textFieldMessage.setText(s);
    }
    
    @FXML
    private void handleOpenMenuItem() {
        System.out.println("MENU ITEM");
        
        FileChooser x = new FileChooser();
        
        File selectedFile;
        selectedFile = x.showOpenDialog(null);
        System.out.println(selectedFile);
    }
}
