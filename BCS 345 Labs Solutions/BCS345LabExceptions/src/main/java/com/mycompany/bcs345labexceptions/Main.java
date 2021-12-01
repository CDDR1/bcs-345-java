/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bcs345labexceptions;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos_Duque
 */
public class Main {
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setName("John Doe");
        try {
            e1.setId(753);
        } catch (BadIdException ex) {
            System.out.println("Id is invalid");
        }
               
        try {
            e1.setSalary(65.43);
        } catch (BadSalaryException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        e2.setName("Bruce Banner");
        try {
            e2.setId(32408);
        } catch (BadIdException ex) {
            int badId = ex.getBadId();
            System.out.printf("Bad id exception caught - %d\n", badId);
        }
        
        try {
            e2.setSalary(-160.50);
        } catch (BadSalaryException ex) {
            double badSalary = ex.getBadSalary();
            System.out.printf("Bad salary exception caught - %f\n", badSalary);           
        }
        
    }
}
