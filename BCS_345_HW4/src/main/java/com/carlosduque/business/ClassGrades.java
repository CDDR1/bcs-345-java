/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlosduque.business;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * Contains code for the ClassGrades class. It has its variables, get and set
 * methods, constructors and other methods needed by the program.
 *
 * @author Carlos_Duque
 * @version 1.0
 * @since 10/23/2021
 */
public class ClassGrades {
    
    // Variables
    private Student student;
    private Submission[] submissions;
    
    /**
     * This method is the default constructor of the ClassGrades class.
     * 
     */
    public ClassGrades() {
        this.student = new Student();     
        this.submissions = new Submission[4];   
        
        for (int i = 0; i < this.submissions.length; i++) {
            this.submissions[i] = new Submission();
        }
    }
    
    /**
     * Sets the student variable to the given value.
     * 
     * @param w New value for the student variable.
     */
    public void setStudent(Student w) {
        this.student = w;
    }
    
    /**
     * Returns the value of the student variable.
     * 
     * @return Value of the variable student.
     */
    public Student getStudent() {
        return this.student;
    }
    
    /**
     * Finds the instance of submission that has the highest score.
     * 
     * @return submission with highest score.
     */
    public Submission getHighestScoreSubmission() {
        Submission highestScoreSubmission = this.submissions[0];
        
        for (Submission submission : this.submissions) {
            if (highestScoreSubmission.getScore() < submission.getScore()) {
                highestScoreSubmission = submission;
            }
        }
        
        return highestScoreSubmission;
    }
     
    /**
     * Receives an index as a parameter finds the submission using the index.
     * 
     * @param index Used to find the instance of submission.
     * @return instance of submission at the given index.
     */
    public Submission getAt(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= this.submissions.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.submissions[index];
    }
    
    /**
     * Prints a report in the given Print Stream.
     * 
     * @param ps Print Stream used to print the report.
     */
    public void report(PrintStream ps) {
        
        ps.printf("\nStudent Grades\n");
        ps.printf("--------------\n\n");
        ps.printf("First: %s\n", this.student.getFirst());
        ps.printf("Last: %s\n", this.student.getLast());
        ps.printf("Major: %s\n\n", this.student.getMajor());
        ps.printf("%8s%9s%9s%16s%17s%7s\n", "Month", "Day", "Year", "Assignment", "Numeric Grade", "Letter");
        ps.printf("%8s%9s%9s%16s%17s%7s\n", "-----", "---", "----", "----------", "-------------", "------");
        
        double numericTotal = 0;
        
        for (Submission submission : this.submissions) {
            
            int month = submission.getDate().getMonth();
            int day = submission.getDate().getDay();
            int year = submission.getDate().getYear();
            String assignment = submission.getAssignment();
            double numericGrade = submission.getScore();
            String letter;
            
            if (numericGrade > 96) 
                letter = "A+";
            else if (numericGrade > 92) 
                letter = "A";
            else if (numericGrade > 89) 
                letter = "A-";
            else if (numericGrade > 86) 
                letter = "B+";
            else if (numericGrade > 82) 
                letter = "B";
            else if (numericGrade > 79)
                letter = "B-";
            else if (numericGrade > 76) 
                letter = "C+";
            else if (numericGrade > 72) 
                letter = "C";
            else if (numericGrade > 69) 
                letter = "C-";
            else if (numericGrade > 66) 
                letter = "D+";
            else if (numericGrade >= 65) 
                letter = "D";
            else 
                letter = "F";              
            
            ps.printf("%8d%9d%9d%16s%17.2f %s\n", month, day, year, assignment, numericGrade, letter);
            
            numericTotal += numericGrade;
        }
        
        double numericAverage = numericTotal / this.submissions.length;
        ps.printf("\nNumeric Average: %.2f\n", numericAverage);
        
        String overallLetter;
        if (numericAverage > 96) 
            overallLetter = "A+";
        else if (numericAverage > 92) 
            overallLetter = "A";
        else if (numericAverage > 89) 
            overallLetter = "A-";
        else if (numericAverage > 86) 
            overallLetter = "B+";
        else if (numericAverage > 82) 
            overallLetter = "B";
        else if (numericAverage > 79)
            overallLetter = "B-";
        else if (numericAverage > 76) 
            overallLetter = "C+";
        else if (numericAverage > 72) 
            overallLetter = "C";
        else if (numericAverage > 69) 
            overallLetter = "C-";
        else if (numericAverage > 66) 
            overallLetter = "D+";
        else if (numericAverage >= 65) 
            overallLetter = "D";
        else 
            overallLetter = "F";  
        
        ps.printf("Overall Letter: %s\n", overallLetter);
    }
    
    /**
     * Writes the data of the class in JSON format into another file.
     * 
     * @param ps Print Stream where the data is shown.
     */
    public void writeJSON(PrintStream ps) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        String jsonString = gson.toJson(this);
        ps.println(jsonString);
    }
    
    /**
     * Reads a JSON file and stores the data in the class's variables.
     * 
     * @param fr FileReader from where the data is read.
     */
    public void readJSON(FileReader fr) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        ClassGrades cg = gson.fromJson(fr, ClassGrades.class);
        
        this.student = cg.getStudent();
        
        for (int i = 0; i < this.submissions.length; i++) {
            this.submissions[i] = cg.getAt(i);
        }
    }
    
    /**
     * Overrides toString method of the ClassGrades class.
     * 
     * @return A string containing the data.
     */
    @Override
    public String toString() {     
        String string = String.format("\n%s", student.toString());

        for (Submission submission : this.submissions) {
            string += String.format("%s", submission.toString());
        }
        
        return string;
    }
}
