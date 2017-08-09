/*
* File: StateDataEntry.java
* Author: Nicole Donnelly
* Date: 20170806
* Purpose: Use state objects from StateBirdFlower class from command line input. 
*/

import java.util.Scanner;

public class StateDataEntry {

  public static void main(String[] args) {
    
    // create a String Buffer to store results
    StringBuffer allResults = new StringBuffer();
    // Use the Scanner class to input data
    Scanner scannerIn = new Scanner(System.in);
    
    while (true) {
      System.out.println("Enter a State or None to exit: ");
      // read the next line, normalize the string for comparison
      String newState = scannerIn.nextLine().trim().replace(" ", "").toLowerCase();
      if (newState.equals("none")) {
        break; // end the loop when none is entered
      } //end if
      
      StateBirdFlower state = new StateBirdFlower(newState);
      System.out.println(state.toString());
      
      // append the results to the string buffer
      allResults.append(String.format("%s, %s, %s\n", state.getStateName(),
          state.getStateBird(), state.getStateFlower()));
    } // end while
    
    System.out.println("**** Thank you *****");
    System.out.println("A summary report for each State, Bird, and Flower is:");
    System.out.println(allResults);
    System.out.println("Please visit our site again!");
    
    
    //close the scanner 
    scannerIn.close();

  } // end main

} // end StateDataEntry
