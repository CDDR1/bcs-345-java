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
public class Main {
    
    public static void main(String[] args) {
        Shape s;
        s = new Circle(3);
        
        Shape[] sa = new Shape[4];
        sa[0] = new Circle(3);
        sa[1] = new Rectangle(2, 3);
        sa[2] = new Circle(3);
        sa[3] = new Rectangle(3, 4);
        
        for (int i = 0; i < sa.length; i++) {
            sa[i].calculateArea();
            sa[i].display();
//            System.out.printf("Area = %f\n", sa[i].getArea());
        }
                
    }
}
