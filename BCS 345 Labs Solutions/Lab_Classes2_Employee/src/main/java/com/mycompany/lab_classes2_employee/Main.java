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
public class Main {
    
    public static void main(String[] args) {
        
        Employee e = new Employee("Carlos", 50, 20);
        Employee e2 = new Employee("Daniel", 40, 35);
        
        System.out.printf("Employee 1\n-------------\n");
        System.out.printf("Name: %s\n", e.getName());
        System.out.printf("Pay: $%.2f\n", e.getPay());
        
        System.out.printf("Employee 2\n-------------\n");
        System.out.printf("Name: %s\n", e2.getName());
        System.out.printf("Pay: $%.2f\n", e2.getPay());
    }
}
