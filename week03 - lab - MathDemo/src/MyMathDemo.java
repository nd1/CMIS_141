/*
* File: MyMathDemo.java
* Author: Nicole Donnelly
* Date: 20170708
* Purpose: This program demonstrates the use of static methods
* and fields of the Math class.
*/

// Import statements
import java.util.Scanner;

public class MyMathDemo {
  public static void main(String[] args)  {     

    // Display a Welcome note
       System.out.println("Welcome to the Math Class Demo");

    // Variables to hold values
    double firstSide = 0.0;
    double secondSide = 0.0;
    
    // Use the Scanner class to input data
    Scanner scannerIn = new Scanner(System.in);
    
    System.out.println("Let's compute the hypotenuse of a right triangle.");
    System.out.println("You will need to enter the lengths of 2 sides.");
    System.out.println("Enter the length of the first side:");
    // scan the value
    firstSide = scannerIn.nextDouble();
    System.out.println("Enter the lenght of the second side:");
    secondSide = scannerIn.nextDouble();
    
    // Verify the sides were entered
    System.out.println("The following lengths were entered " + firstSide + ", " + secondSide);
    
    // Compute the hypotenuse
    System.out.println("The hypotenuse of the triangle is: " + Math.hypot(firstSide, secondSide));
    
    // Calculate the 2nd, 3rd, and 4th power of 10
    System.out.println("10 raised to the 2nd power is: " + Math.pow(10, 2));
    System.out.println("10 raised to the 3rd power is: " + Math.pow(10, 3));
    System.out.println("10 raised to the 4th power is: " + Math.pow(10, 4));
    
    // 5 random numbers between 1 and 35
    System.out.println("Here are 5 random numbers for the Maryland Pick 5:");
    int pick1 = (int) (Math.random() * 36);
    int pick2 = (int) (Math.random() * 36);
    int pick3 = (int) (Math.random() * 36);
    int pick4 = (int) (Math.random() * 36);
    int pick5 = (int) (Math.random() * 36);
    System.out.println(pick1 + ", " + pick2 + ", " + pick3 + ", " + pick4 + ", " + pick5);
    
    // Close the scanner
    scannerIn.close();
  } // end main
} // end MyMathDemo
