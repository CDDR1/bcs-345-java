/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bcs345labclasses1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos_Duque
 */
public class Main {
    
    public static void main(String[] args) {
        
        SalesPerson sp;
        sp = new SalesPerson();
        
        sp.setName("Carlos");
        sp.setSalesTotal(200);
        sp.statusMessage();
        
        SalesPerson other;
        other = new SalesPerson();
        
        other.setName("Rose");
        other.setSalesTotal(125);
        other.statusMessage();
        
//        FileReader fr = null;
//        try {
//            fr = new FileReader("Data.txt");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(SalesPerson.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        Scanner s = new Scanner(fr);
//        
//        String temp;
//        
//        while (s.hasNextLine()) {
//            temp = s.next();
//
//            System.out.printf(temp);
//        }
    }
}
