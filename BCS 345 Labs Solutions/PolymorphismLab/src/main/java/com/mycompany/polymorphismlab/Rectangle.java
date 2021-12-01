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
public class Rectangle extends Shape {
    
    // Variables 
    private double length;
    private double width;
    
    // Methods
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override 
    public void calculateArea() {
        area = length * width;
    }
    
    @Override
    public void display() {
//        System.out.printf("%f\n%f\n%f\n%", length, width, area);
    System.out.println("Rectangle: " + area);
    }
}
