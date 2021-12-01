
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos_Duque
 */
public class Main {
    public static void main(String[] args) {
        
        // Part 1
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter a number: \n");
        int num1 = input.nextInt();
        
        System.out.printf("Enter another number: \n");
        int num2 = input.nextInt();
        
        int multiplication = num1 * num2;
        
        System.out.printf("The result of %d * %d = %d\n\n", num1, num2, multiplication);
        
        
        // Part 2: Write to a file 
        PrintStream output = new PrintStream("text.txt");
        
        output.printf("The result of %d * %d = %d\n", num1, num2, multiplication);
        
        
        // Part 3: Read input from file
        FileReader inputFile = new FileReader("input.txt");
        Scanner readFromFile = new Scanner(inputFile);
        
        int num1FromFile = readFromFile.nextInt();
        int num2FromFile= readFromFile.nextInt();
        
        int fileMultiplication = num1FromFile * num2FromFile;
        
        System.out.printf("The result of %d * %d = %d\n\n", num1FromFile, num2FromFile, fileMultiplication);
        
        
        // Part 4: Use loop to read data from file
        FileReader inputNumbers = new FileReader("numbers.txt");
        Scanner readFromNumbers = new Scanner(inputNumbers);
        
        int firstNum;
        int secondNum;
        int numMultiplication;
        
        while (readFromNumbers.hasNext()) {
            firstNum = readFromNumbers.nextInt();
            secondNum = readFromNumbers.nextInt();
            
            numMultiplication = firstNum * secondNum;
            
            // System.out.printf("The result of %d * %d = %d\n", firstNum, secondNum, numMultiplication);
            
            
            // Part 6: Column headings
            System.out.printf("NUMBERS         DATA\n");
            System.out.printf("--------------------\n");
            
            
            // Part 5: Format ouput to display data in columns
            System.out.printf("Number 1: %10d\n", firstNum);
            System.out.printf("Number 2: %10d\n", secondNum);
            System.out.printf("Result: %12d\n\n", numMultiplication);
        }
    }
}
