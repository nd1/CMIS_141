import java.util.Scanner;

/*
* File: MyStringDemo.java
* Author: Nicole Donnelly
* Date: 20170708
* Purpose: This program demonstrates the use of static methods
* and fields of the Math class.
*/
public class MyStringDemo {
  public static void main(String[] args)  { 
    
    // Construct a Scanner class
    Scanner scannerIn = new Scanner(System.in);
    
    // prompt the user to enter two strings
    System.out.println("Enter a string");
    String firstString = scannerIn.next();
    
    System.out.println("Enter a second string");
    String secondString = scannerIn.next();
    
    // concatenate the strings
    System.out.println("First concatenation method: " + firstString.concat(secondString));
    System.out.println("Second concatenation method: " + firstString + secondString);
    
    // Prompt user for two integers
    System.out.println("Enter an integer");
    // Scan the next String and parse the Integer value
    Integer firstInt = Integer.parseInt(scannerIn.next());
    
    System.out.println("Enter another integer");
    // Scan the next String and parse the Integer value
    Integer secondInt = Integer.parseInt(scannerIn.next());
    
    // Display the length of each integer by converting to a string
    String intStringOne = Integer.toString(firstInt);
    String intStringTwo = Integer.toString(secondInt);
    
    System.out.println("The length of your first integer is " + intStringOne.length());
    System.out.println("The length of your second integer is " + intStringTwo.length());
    
    // Close the scanner
    scannerIn.close();
} // end main

} // end MyStringDemo
