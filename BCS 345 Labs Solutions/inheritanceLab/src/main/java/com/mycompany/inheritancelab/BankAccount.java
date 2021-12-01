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
public class BankAccount {
    
    // Varibales
    protected String name;
    protected double balance;
    
    // Methods 
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public BankAccount() {
        name = "NO_NAME";
        balance = 0;
    }
    
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public void deposite(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("You can't have a negative balance");
        }
        else {
            balance -= amount;
        }
    }
}
