/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlosduque.presentation;
import com.carlosduque.business.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Contains main program code. This class shows a menu and gets an input
 * from the user to perform an action based on this input. 
 * 
 * @author Carlos_Duque
 * @version 1.0
 * @since 10/1/2021
 */
public class Main {  
    /**
     * This method shows a menu to the user and performs different 
     * actions based on the input given by the user. It allows to read files, 
     * write files and show information from a file into the screen.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        // Instance of ClassGrades where all the operations will be done
        ClassGrades cg = new ClassGrades();
        
        // Scanner used to read the user's choice
        Scanner scan = null;
        scan = new Scanner(System.in);             
        
        // User Menu
        int userChoice;
        do {
            System.out.printf("\nClass Grades UI\n"); 
            System.out.printf("---------------\n"); 
            System.out.printf("1 - Read class grades from file as JSON\n"); 
            System.out.printf("2 - Write class grades to file as JSON\n"); 
            System.out.printf("3 - Show submission at index on screen\n"); 
            System.out.printf("4 - Show submission with highest score on screen\n");             
            System.out.printf("5 - Show class grades report on screen\n");             
            System.out.printf("6 - Show class grades toString on screen\n");             
            System.out.printf("7 - Exit\n"); 
            System.out.printf("Enter Choice\n");
            userChoice = Integer.valueOf(scan.nextLine());
                   
            switch (userChoice) {
                case 1: 
                    System.out.printf("Enter input filename\n");
                    String inputFile = scan.nextLine();                   
                    
                    FileReader fileReader = null;
                    try {
                        fileReader = new FileReader(inputFile);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    cg.readJSON(fileReader);
                    break;

                case 2: 
                    System.out.printf("Enter output filename\n");
                    String outputFile = scan.nextLine();
                    
                    PrintStream printStream = null;
                    try {
                        printStream = new PrintStream(outputFile);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    cg.writeJSON(printStream);
                    break;

                case 3: 
                    System.out.println("Enter index");
                    int index = Integer.valueOf(scan.nextLine());           
                    
                    try {
                        Submission submissionAtIndex = cg.getAt(index);
                        System.out.println("\n" + submissionAtIndex);
                    }
                    catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("The index you entered is invalid");
                    }                  
                    break;
                    
                case 4:
                    Submission highestScoreSubmission = cg.getHighestScoreSubmission();
                    System.out.println("\n" + highestScoreSubmission);
                    break;
                    
                case 5: 
                    PrintStream ps = new PrintStream(System.out);
                    cg.report(ps);
                    break;
                    
                case 6:
                    System.out.println(cg.toString());
                    break;
            }
            
        } while (userChoice != 7);    
        
        // Message when program ends
        System.out.printf("Program done\n");
    }
}
