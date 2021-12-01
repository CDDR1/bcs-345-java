/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bcs345labexceptions;

/**
 *
 * @author Carlos_Duque
 */
public class BadSalaryException extends Exception {
    
    // Variables
    private double salary;
    
    // Methods
    public void setBadSalary(double salary) {
        this.salary = salary;
    }
    public double getBadSalary() {
        return salary;
    }
}
