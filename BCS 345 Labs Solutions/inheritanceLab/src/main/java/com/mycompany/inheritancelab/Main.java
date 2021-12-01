/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritancelab;

/**
 *
 * @author Carlos_Duque
 */
public class Main {
    
    public static void main(String[] args) {
        
        InterestAccount ia = new InterestAccount("John Doe", 5000, 0.3);
        
        ia.deposite(2000);
        System.out.println(ia.getBalance());
        
        ia.withdraw(4000);
        System.out.println(ia.getBalance());
        
        ia.ApplyInterest(ia.getInterest());
        System.out.println(ia.getBalance());
        
        System.out.println(ia.toString());
    }
}
