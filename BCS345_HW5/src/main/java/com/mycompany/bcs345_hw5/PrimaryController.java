package com.mycompany.bcs345_hw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import java.io.PrintStream;


/**
 * Contains the code of the primary controller. All the GUI event handlers
 * are defined in this class. 
 * 
 * @author Carlos_Duque
 * @version 1.0
 * @since 11/28/2021
 */
public class PrimaryController {
    
    // Variables
    private ClassGrades cg = new ClassGrades();
    
    @FXML
    private MenuItem openMenuItem;
    
    @FXML
    private MenuItem saveReportMenuItem;
    
    @FXML 
    private MenuItem closeMenuItem;
    
    @FXML
    private ListView firstListView;
    
    @FXML
    private ListView lastListView;
    
    @FXML
    private ListView majorListView;
    
    @FXML
    private ListView submissionsListView;
    
    // Methods
    
    /**
     * Contains event handler code for the "open" menu item. 
     * 
     * @param event action event of the open menu item
     */
    @FXML 
    protected void handleOpen(final ActionEvent event) {
        
        // Observable lists
        ObservableList<String> firstCollection = firstListView.getItems();
        ObservableList<String> lastCollection = lastListView.getItems();
        ObservableList<String> majorCollection = majorListView.getItems();
        ObservableList<Submission> submissionsCollection = submissionsListView.getItems();
        
        FileChooser fc = new FileChooser();
        File current = null;
        
        try {
        current = new File(new File(".").getCanonicalPath()); 
        } 
        catch (IOException e1) {
            e1.printStackTrace();
        }
        
        fc.setInitialDirectory(current);
        File selectedFile = fc.showOpenDialog(null);
        if (selectedFile != null) {
            FileReader fr = null; 
            try {
                fr = new FileReader(selectedFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // Read data from file
            cg.readJSON(fr);          
            
            // Clear ListView items
            firstCollection.clear();
            lastCollection.clear();
            majorCollection.clear();
            submissionsCollection.clear();
            
            // Fill ListView items
            String firstName = cg.getStudent().getFirst();                                  
            firstCollection.add(firstName);            
            
            String lastName = cg.getStudent().getLast();           
            lastCollection.add(lastName);
            
            String studentMajor = cg.getStudent().getMajor();            
            majorCollection.add(studentMajor);
                      
            for (int i = 0; i < 4; i++) {
                Submission currentSubmission = cg.getAt(i);               
                submissionsCollection.add(currentSubmission);
            }
        }
    }
    
    /**
     * Contains event handler code for the "save report" menu item. 
     * 
     * @param event action event of the save report menu item
     */
    @FXML
    protected void handleSaveReport(final ActionEvent event) {
        
        FileChooser fc = new FileChooser();
        File current = null;
        
        try {
        current = new File(new File(".").getCanonicalPath()); 
        } 
        catch (IOException e1) {
            e1.printStackTrace();
        }
        
        fc.setInitialDirectory(current);
        File selectedFile = fc.showSaveDialog(null);
        if (selectedFile != null) {
            PrintStream ps = null;
            try {
                ps = new PrintStream(selectedFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
            }
            cg.report(ps);
        }
    }
    
    /**
     * Contains event handler code for the "close" menu item. 
     * 
     * @param event action event of the close menu item
     */
    @FXML 
    protected void handleClose(final ActionEvent event) {
        Platform.exit();
    }
    
}
