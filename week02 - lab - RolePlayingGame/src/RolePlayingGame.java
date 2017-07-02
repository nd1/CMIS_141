/*
* File: RolePlayingGame.java
* Author: Nicole Donnelly
* Date: 20170701
* Purpose: This program demonstrates the use of switch selection
* statements.
*/

// Import statements
import java.util.Scanner;

public class RolePlayingGame {
  public static void main(String[] args) {
    
 // Display a Welcome note
    System.out.println("Welcome! Let's go on an adventure!");

    // Variables to hold values
    char direction;
   
    // Use the Scanner class to input data
    Scanner scannerIn = new Scanner(System.in);
    System.out.println("Enter a Direction (N, S, E, W):");
   
    // the nextInt() method scans the next int value
    direction = scannerIn.next().charAt(0);
    
    // make direction uppercase
    direction = Character.toUpperCase(direction);
    
    // Verify the direction was entered
    System.out.println("The following direction was entered " + direction);
    
    // Selection statement to determine message
    switch (direction) {
      case 'N':
        // Print out message
        System.out.println("North! Winter is coming!");
        break;
      case 'S':
        // Print out message
        System.out.println("South! There be dragons!");
        break;
      case 'E':
        // Print out message
        System.out.println("East! Journey to the East!");
        break;
      case 'W':
        // Print out message
        System.out.println("West! Ayyye Matey!");
        break;
      default:
        System.out.println("We can't go that way!");
        
        // Exit the application for invalid direction
        System.exit(0);
    } // end switch
    
    // close the scanner
    scannerIn.close();
     
  } // end main

} // end RolePlayingGame
