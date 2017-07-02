/* File: MySelectionIfDemo.java
 * Author: Nicole Donnelly
 * Date: 20170701
 * Purpose:  return the total tax due based on an individual’s income
 */

//Import statements
import java.util.Scanner;

public class MySelectionIfDemo {
  public static void main(String[] args) {
    
    // Variables to hold values
    double userIncome = 0;
    double tax = 0;
  
    // Display a Welcome note
    System.out.println("Welcome. Let's compute your tax.");
  
    //Use the Scanner class to input data
    Scanner scannerIn = new Scanner(System.in);
    System.out.println("Enter your income:");
    
    // scan the next double value
    userIncome = scannerIn.nextDouble();
    
    // Verify the income was entered
    System.out.println("The following amount was entered " + userIncome);
    
    // Selection statement to determine the amount of tax
    if (userIncome <= 0) {
      System.out.println("Income must be greater than 0");
      
      // Exit the application for invalid income
      System.exit(0);
      }
    else if (userIncome < 20_000) {
      tax = userIncome * 0.10;
    }
    else if (userIncome < 40_000) {
      tax = userIncome * 0.12;
    }
    else if (userIncome < 60_000) {
      tax = userIncome * 0.14;
    }
    else {
      tax = userIncome * 0.15;
    }

    // Provide tax amount
    System.out.println("Your tax amount is " + tax);
    
    // close scanner
    scannerIn.close();
    
    } //end main
  } //end class
