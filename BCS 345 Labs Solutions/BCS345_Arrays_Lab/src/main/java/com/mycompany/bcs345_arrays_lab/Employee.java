/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bcs345_arrays_lab;

/**
 *
 * @author Carlos_Duque
 */
public class Employee {
    
    private String name;
    private double salesAmount;
    
    public Employee(String name, double salesAmount) {
        this.name = name;
        this.salesAmount = salesAmount;
    }
    
    public String getName() {
        return name;
    }
    public double getSalesAmount() {
        return salesAmount;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
}
