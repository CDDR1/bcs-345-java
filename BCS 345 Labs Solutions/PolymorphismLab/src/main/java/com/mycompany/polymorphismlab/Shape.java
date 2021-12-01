/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polymorphismlab;

/**
 *
 * @author Carlos_Duque
 */
public abstract class Shape implements IDisplayable {
    
    // Variables
    protected double area;

    // Methods
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Shape(double area) {
        this.area = area;
    }
    
    public Shape() {
        this.area = 0;
    }
    
    public abstract void calculateArea();
}
