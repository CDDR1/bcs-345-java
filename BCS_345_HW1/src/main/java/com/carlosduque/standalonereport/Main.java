package com.carlosduque.standalonereport;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Contains main program code. This class reads an input file
 * and generates a report using the information from the input file, 
 * which is then displayed in an output file specified by the user.
 *
 * @author Carlos Duque
 * @version 1.0
 * @since 9/12/2021
 *
*/
public class Main {
    /**
     * Entry point for program
     * @param args 
     */
    public static void main(String[] args) {
        
        // Get the name of the input and output files
        Scanner scanInput = null;
        scanInput = new Scanner(System.in);
        
        String inputFile;
        String outputFile;
        
        System.out.printf("Enter the name of the input file: \n");
        inputFile = scanInput.nextLine();
        
        System.out.printf("Enter the name of the output file: \n");
        outputFile = scanInput.nextLine();
        
        // Get the firstname, lastname, major and submission count form the file
        String firstName;
        String lastName;
        String major;
        String submissionCount;
        
        FileReader readFile = null;
        try {
            readFile = new FileReader(inputFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scanner scanFile = null;
        scanFile = new Scanner(readFile);
        
        firstName = scanFile.nextLine();
        lastName = scanFile.nextLine();
        major = scanFile.nextLine();
        submissionCount = scanFile.nextLine();
        
        
        // Print first part of the report
        PrintStream writeFile = null;
        try {
            writeFile = new PrintStream(outputFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        writeFile.printf("Student Grades\n");
        writeFile.printf("--------------\n\n");
        writeFile.printf("First: %s\n", firstName);
        writeFile.printf("Last: %s\n", lastName);
        writeFile.printf("Major: %s\n\n", major);
        writeFile.printf("   Month      Day     Year      Assignment   Numeric Grade  Letter\n");
        writeFile.printf("   -----      ---     ----      ----------   -------------  ------\n");
        
        
        // Create a variable that stores the sum of all the numeric grades
        double numericGradesTotal = 0;      
        
        // Read records from the file  
        int numOfRecords = Integer.valueOf(submissionCount);
        for (int i = 0; i < numOfRecords; i++) {           
            
              String temp;
              
              // Print month
              temp = scanFile.nextLine(); 
              writeFile.printf("%8s", temp);
              
              // Print day
              temp = scanFile.nextLine();
              writeFile.printf("%9s", temp);
              
              // Print year
              temp = scanFile.nextLine();
              writeFile.printf("%9s", temp);
              
              // Print assignment
              temp = scanFile.nextLine();
              writeFile.printf("%16s", temp);              
              
              // Print numeric grades
              temp = scanFile.nextLine();
              double numericGrade = Double.valueOf(temp);
              writeFile.printf("%16.2f", numericGrade);
              
              // Add the current grade to the grades total
              numericGradesTotal += numericGrade;
                          
              if (numericGrade >= 97) {
                  temp = "A+";
              }
              else if (numericGrade >= 93) {
                  temp = "A";
              }
              else if (numericGrade >= 90) {
                  temp = "A-";
              }
              else if (numericGrade >= 87) {
                  temp = "B+";
              }
              else if (numericGrade >= 83) {
                  temp = "B";
              }
              else if (numericGrade >= 80) {
                  temp = "B-";
              }
              else if (numericGrade >= 77) {
                  temp = "C+";
              }
              else if (numericGrade >= 73) {
                  temp = "C";
              }
              else if (numericGrade >= 70) {
                  temp = "C-";
              }
              else if (numericGrade >= 67) {
                  temp = "D+";
              }
              else if (numericGrade >= 63) {
                  temp = "D";                      
              }
              else if (numericGrade >= 60) {
                  temp = "D-";
              }
              else {
                  temp = "F";
              }
              
              // Print letter grade
              writeFile.printf("  %s\n", temp);              
                                      
        }// End of loop
        
        // Calculate the numeric average and overall letter
        double numericAverage = numericGradesTotal / numOfRecords;
        String overallLetter;
                            
        if (numericAverage >= 97) {
            overallLetter = "A+";
        }
        else if (numericAverage >= 93) {
            overallLetter = "A";
        }
        else if (numericAverage >= 90) {
            overallLetter = "A-";
        }
        else if (numericAverage >= 87) {
            overallLetter = "B+";
        }
        else if (numericAverage >= 83) {
            overallLetter = "B";
        }
        else if (numericAverage >= 80) {
            overallLetter = "B-";
        }
        else if (numericAverage >= 77) {
            overallLetter = "C+";
        }
        else if (numericAverage >= 73) {
            overallLetter = "C";
        }
        else if (numericAverage >= 70) {
            overallLetter = "C-";
        }
        else if (numericAverage >= 67) {
            overallLetter = "D+";
        }
        else if (numericAverage >= 63) {
            overallLetter = "D";                      
        }
        else if (numericAverage >= 60) {
            overallLetter = "D-";
        }
        else {
            overallLetter = "F";
        }
        
        writeFile.printf("\nNumeric Average: %.2f\n", numericAverage);
        writeFile.printf("Overall Letter: %s\n", overallLetter);
    }
}
