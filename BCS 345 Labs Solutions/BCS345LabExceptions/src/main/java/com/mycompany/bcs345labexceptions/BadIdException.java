/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bcs345labexceptions;

/**
 *
 * @author Carlos_Duque
 */
public class BadIdException extends Exception {
    
    // Variables
    private int id;
    
    // Methods
    public void setBadId(int id) {
        this.id = id;
    }
    public int getBadId() {
        return id;
    }
}
