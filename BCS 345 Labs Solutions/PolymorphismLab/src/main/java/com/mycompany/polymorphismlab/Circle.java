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
public class Circle extends Shape {
      
    // Variables
    protected double radius;
    
    // Methods
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void calculateArea() {
        area = 3.14 * radius * radius;
    }
    
    @Override
    public void display() {
//        System.out.printf("%f\n%f\n%", radius, area);
    System.out.println("Circle: " + area);
    }
}
