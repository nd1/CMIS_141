/*
 * File: AddressBook.java
 * Author: Nicole Donnelly
 * Date: 20170809
 * Purpose: Prompt the user to enter their name, age and zip code. 
 * Use exceptions to catch values that are not numbers for the age and zip code.
 */

import java.util.Scanner;

public class AddressBook {

  public static void main(String[] args) {
    
    // declare variables
    String name;
    int age;
    int zipCode;
    
    Scanner scannerIn = new Scanner(System.in);
    
    // prompt the user to enter their name (no error checking)
    System.out.println("Enter your name: ");
    name = scannerIn.nextLine();

    // prompt the user to enter their age
    while (true) {
      try {
          System.out.println("Enter your age (e.g. 44): ");
          age = Integer.parseInt(scannerIn.next());
          break;
          } 
      catch (NumberFormatException ne) {
          System.err.println("NumberFormatException: " + 
                  ne.getMessage());
          System.out.println("Please enter a valid age: ");
          } 
      } // End while loop
    
    // prompt the user to enter their zip code
    while (true) {
      try {
          System.out.println("Enter your zip code (e.g. 20001): ");
          zipCode = Integer.parseInt(scannerIn.next());
          break;
          } 
      catch (NumberFormatException ne) {
        System.err.println("NumberFormatException: " + 
                  ne.getMessage());
          System.out.println("Please enter a valid zip code: ");
          } 
      } // End while loop
    
    // close the scanner
    scannerIn.close();
    
    // show data entered
    System.out.println("Thank you " + name + "!");
    System.out.println("Your age is " + age + ".");
    System.out.println("Your zip code is " + zipCode + ".");
  }

}
