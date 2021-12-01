/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bcs345labclasses1;


/**
 *
 * @author Carlos_Duque
 */
public class SalesPerson {
    // Atributes
    private String name;
    private double salesTotal;
    
    // Behaviors
    public void setName(String newName) {
        name = newName;
    }
    public void setSalesTotal(double newSalesTotal) {
        salesTotal = newSalesTotal;
    }
    
    public String getName() {
        return name;
    }
    public double getSalesTotal() {
        return salesTotal;
    }
    
    public void statusMessage() {
        if (salesTotal >= 100) {
            System.out.printf("Performing well\n");
        }
        else {
            System.out.printf("Not meeting expectations\n");
        }
    }
    
//    public double quotaDifference(double quota, String name, double sales) {
//        
//    }
    
}
