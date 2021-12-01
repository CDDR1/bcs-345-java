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
 * Contains code for the Student class. It has its variables, get and set
 * methods, constructors and the other methods needed by the program.
 * 
 * @author Carlos_Duque
 * @version 1.0
 * @since 10/1/2021
 */
public class Student {
    
    // Variables 
    private String first;
    private String last;
    private String major;
    
    // Constructors
    
    /**
     * This method is the default constructor of the Student class.
     * 
     */
    public Student() {
        this.first = "NO_FIRST";
        this.last = "NO_LAST";
        this.major = "NO_MAJOR";
    }
    
    /**
     * This method is the constructor of the Student class that 
     * sets the variables to the values passed as parameters.
     * 
     * @param first New value for the variable "first".
     * @param last New value for the variable "last".
     * @param major New value for the variable "major".
     */
    public Student(String first, String last, String major) {
        this.first = first;
        this.last = last;
        this.major = major;
    }
    
    // Set Methods
    
    /**
     * Sets the variable "first" to the given parameter.
     * 
     * @param first New value for the variable "first".
     */
    public void setFirst(String first) { 
        this.first = first; 
    }
    
    /**
     * Sets the variable "last" to the given parameter.
     * 
     * @param last New value for the variable "last".
     */
    public void setLast(String last) { 
        this.last = last; 
    }
    
    /**
     * Sets the variable "major" to the given parameter.
     * 
     * @param major New value for the variable "major".
     */
    public void setMajor(String major) { 
        this.major = major; 
    }
 
    // Get Methods
    
    /**
     * Returns the value of the variable "first".
     * 
     * @return The value of the variable "first".
     */
    public String getFirst() { 
        return first; 
    }
    
    /**
     * Returns the value of the variable "last".
     * 
     * @return The value of the variable "last".
     */
    public String getLast() { return last; }
    
    /**
     * Returns the value of the variable "major".
     * 
     * @return The value of the variable "major".
     */
    public String getMajor() { 
        return major; 
    }
    
    // JSON Methods
    
    /**
     * This method reads data from a JSON file into a new instance
     * of Student and assigns the value of the variables of that 
     * instance of Student to "this".
     * 
     * @param fr The file reader that will be used to read the file.
     */
    public void readJSON(FileReader fr) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        Student s = gson.fromJson(fr, Student.class);
        
        this.first = s.getFirst();
        this.last = s.getLast();
        this.major = s.getMajor();
    }
    
    /**
     * This method writes data stored in the Student class into another file.
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
     * This method overrides the toString method of the Student class.
     * 
     * @return A formatted string with descriptive data.
     */
    @Override 
    public String toString() {
        String studentString = String.format("First Name = %s, Last Name = %s, Major = %s\n", first, last, major);     
        return studentString;
    }
}
