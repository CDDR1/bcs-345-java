/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab_classes2_employee;

/**
 *
 * @author Carlos_Duque
 */
public class Employee {
    
    // Variables
    private String name;
    private double hoursWorked;
    private double hourlyRate;
    
    
    // Default Constructor
    public Employee() {
        name = "NO_NAME";
        hoursWorked = 0;
        hourlyRate = 0;
    }
    
    // Constructor
    public Employee(String newName, double newHoursWorked, double newHourlyRate) {
        name = newName;
        hoursWorked = newHoursWorked;
        hourlyRate = newHourlyRate;
    }
    
    // Get and Set methods
    public void setName(String newName) {
        name = newName;
    }
    public void setHoursWorked(double newHoursWorked) {
        hoursWorked = newHoursWorked;
    }
    public void setHourlyRate(double newHourlyRate) {
        hourlyRate = newHourlyRate;
    }
    
    public String getName() {
        return name;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    // Methods
    public double getPay() {
        double pay = hoursWorked * hourlyRate;
        return pay;
    }
}
