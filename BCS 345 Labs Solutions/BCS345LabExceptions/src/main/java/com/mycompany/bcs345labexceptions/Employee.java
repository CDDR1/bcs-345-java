/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bcs345labexceptions;

import java.util.Set;

/**
 *
 * @author Carlos_Duque
 */
public class Employee {
    
    // Variables
    private String name;
    private int id;
    private double salary;
    
    //Methods   
    public Employee() {
        name = "NO_NAME";
        id = 0;
        salary = 0;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setId(int id) throws BadIdException {
        if (id < 0 || id > 9999) {
            BadIdException e = new BadIdException();
            e.setBadId(id);
            throw e;
        }
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setSalary(double salary) throws BadSalaryException {
        if (salary < 0) {
            BadSalaryException b = new BadSalaryException();
            b.setBadSalary(salary);
            throw b;             
        }
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
