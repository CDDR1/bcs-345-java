/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlosduque.business;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * Contains code for the Submission class. It has its variables, get and set
 * methods, constructors and the other methods needed by the program.
 * 
 * @author Carlos_Duque
 * @version 1.0
 * @since 10/1/2021
 */
public class Submission {
    
    // Variables
    private SubDate date;
    private String assignment;
    private double score;
    
    // Constructors
    
    /**
     * This method is the default constructor of the Submission class.
     * 
     */
    public Submission() {
        this.date = new SubDate();
        this.assignment = "NO_ASSIGNMENT";
        this.score = 0.0;
    }
    
    /**
     * This method is the constructor of the Submission class that 
     * sets the variables to the values passed as parameters.
     * 
     * @param d New value for the variable "d".
     * @param assignmentName New value for the variable "assignmentName".
     * @param score New value for the variable "score".
     */
    public Submission(SubDate d, String assignmentName, double score) {
        this.date = d;
        this.assignment = assignmentName;
        this.score = score;
    }
    
    // Set Methods
    
    /**
     * Sets the variable "date" to the given parameter.
     * 
     * @param date New value for the variable "date".
     */
    public void setDate(SubDate date) { 
        this.date = date; 
    }
    
    /**
     * Sets the variable "assignment" to the given parameter.
     * 
     * @param assignment New value for the variable "assignment".
     */
    public void setAssignment(String assignment) { 
        this.assignment = assignment; 
    }
    
    /**
     * sets the variable "score" to the given parameter.
     * 
     * @param score New value for the variable "score".
     */
    public void setScore(double score) { 
        this.score = score; 
    }
    
    // Get Methods
    
    /**
     * Returns the value of the variable "date".
     * 
     * @return The value of the variable "date".
     */
    public SubDate getDate() { 
        return date; 
    }
    
    /**
     * Returns the value of the variable "assignment".
     * 
     * @return The value of the variable "assignment".
     */
    public String getAssignment() { 
        return this.assignment; 
    }
    
    /**
     * Returns the value of the variable "score".
     * 
     * @return The value of the variable "score".
     */
    public double getScore() { 
        return this.score; 
    }
    
    // JSON Methods
    
    /**
     * This method reads data from a JSON file into a new instance
     * of Submission and assigns the value of the variables of that 
     * instance of Student to "this".
     * 
     * @param fr The file reader that will be used to read the file.
     */
    public void readJSON(FileReader fr) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        Submission s = new Submission();
        s = gson.fromJson(fr, Submission.class);
        
        this.date = s.getDate();
        this.assignment = s.getAssignment();
        this.score = s.getScore();            
    }
    
    /**
     * This method writes data stored in the Submission class into another file.
     * 
     * @param ps The print stream used to write the data into the given file.
     */
    public void writeJSON(PrintStream ps) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        String jsonString = gson.toJson(this);
        ps.println(jsonString);
    }
    
    // toString Method
    
    /**
     * This method overrides the toString method of the Submission class.
     * 
     * @return A formatted string with descriptive data.
     */
    @Override 
    public String toString() {
        String reportDate = date.toString();
        
        String reportAssignment = String.valueOf(assignment);
        String reportScore = String.valueOf(score);
        
        String reportString = "Submission Date = " + reportDate + "\n"
                            + "Assignment = " + reportAssignment + "\n"
                            + "Score = " + reportScore + "\n";
        
        return reportString;
    }
}
