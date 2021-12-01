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
public class InterestAccount extends BankAccount {
    
    // Variables
    private double interest;
    
    // Methods
    public void setInterest(double interest) {
        this.interest = interest;
    }
    
    public double getInterest() {
        return interest;
    }
    
    public InterestAccount() {
        super("NO_NAME", 0);
        interest = 0;
    }
    
    public InterestAccount(String name, double balance, double interest) {
        super(name, balance);
        this.interest = interest;
    }
    
    public void ApplyInterest(double interestRate) {
        double interest = balance * interestRate;
        balance += interest;
    }
    
    @Override 
    public String toString() {
        String s = String.format("\nName = %s\nBalance = %.2f\nInterest = %.2f\n", name, balance, interest);      
        return s; 
    }
}
