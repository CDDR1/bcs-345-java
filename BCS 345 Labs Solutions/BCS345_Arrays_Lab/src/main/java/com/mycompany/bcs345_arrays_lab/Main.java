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
public class Main {
    
    public static void main(String[] args) {
        
        //////////////
        // Part 1
        //////////////
//        double[] sales = { 100.5, 50, 35, 45.6 };
//        
//        double total = 0;
//        
//        for (double amount : sales) {
//            System.out.println(amount);
//            total += amount;
//        }
//        
//        double avg = total / 4;
//        
//        System.out.printf("The average is %f", avg);
        
        ////////////
        // Part 2
        ////////////
        Employee[] e = new Employee[4];
        
        e[0] = new Employee("John Doe", 300);
        e[1] = new Employee("Jane Doe", 800);
        e[2] = new Employee("Johnny Doe", 200);
        e[3] = new Employee("Peter Parker", 500);
        
        double total = 0;
        
        for (Employee employee : e) {
            System.out.printf("Name: %s  Sales: %.2f\n", employee.getName(), employee.getSalesAmount());
            total += employee.getSalesAmount();
        }
        
        double avg = total / e.length;
        
        System.out.printf("The average is %.2f\n", avg);
        
        ////////////
        // Part 3
        ////////////
        String name = "Peter Parker";
        
        for (Employee employee : e) {
            if (employee.getName() == name) {
                System.out.printf("The sales amount of %s is $%.2f\n", name, employee.getSalesAmount());
            }
        }
    }
}
