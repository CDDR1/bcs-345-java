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
 * Contains code for the SubDate class. It has its variables, get and set
 * methods, constructors and the other methods needed by the program.
 * 
 * @author Carlos_Duque
 * @version 1.0
 * @since 10/1/2021
 */
public class SubDate {

    // Variables
    private int month;
    private int day;
    private int year;
    
    // Constructors
    
    /**
     * This method is the default constructor of the SubDate class.
     * 
     */
    public SubDate() {
        this.month = 1;
        this.day = 1;
        this.year = 2021;
    }
    
    /**
     * This method is the constructor of the SubDate class that 
     * sets the variables to the values passed as parameters.
     * 
     * @param month New value for the variable "month".
     * @param day New value for the variable "day".
     * @param year New value for the variable "year".
     */
    public SubDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    // Set Methods
    
    /**
     * Sets the variable "month" to the given parameter.
     * 
     * @param month New value for the variable "month".
     */
    public void setMonth(int month) { 
        this.month = month; 
    }
    
    /**
     * Sets the variable "day" to the given parameter.
     * 
     * @param day New value for the variable "day".
     */
    public void setDay(int day) { 
        this.day = day; 
    }
    
    /**
     * Sets the variable "year" to the given parameter.
     * 
     * @param year New value for the variable "year".
     */
    public void setYear(int year) { 
        this.year = year; 
    }
    
    // Get Methods
    
    /**
     * Returns the value of the variable "month".
     * 
     * @return The value of the variable "month".
     */
    public int getMonth() { 
        return month; 
    }
    
    /**
     * Returns the value of the variable "day".
     * 
     * @return The value of the variable "day".
     */
    public int getDay() { 
        return day; 
    }
    
    /**
     * Returns the value of the variable "year".
     * 
     * @return The value of the variable "year".
     */
    public int getYear() { 
        return year; 
    }
    
    // JSON Methods
    
    /**
     * This method reads data from a JSON file into a new instance
     * of SubDate and assigns the value of the variables of that 
     * instance of SubDate to "this".
     * 
     * @param fr The file reader that will be used to read the file.
     */
    public void readJSON(FileReader fr) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        SubDate sd = new SubDate();
        sd = gson.fromJson(fr, SubDate.class);
        
        this.month = sd.getMonth();
        this.day = sd.getMonth();
        this.year = sd.getYear();
    }
    
    /**
     * This method writes data stored in the SubDate class into another file.
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
     * This method overrides the toString method of the SubDate class.
     * 
     * @return A formatted string with descriptive data.
     */
    @Override
    public String toString() {
        String formattedDate;
        formattedDate = String.valueOf(month) + "/" + String.valueOf(day) + "/" + String.valueOf(year);
        return formattedDate;
    }
}
