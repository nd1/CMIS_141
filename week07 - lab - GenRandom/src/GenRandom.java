/*
* File: GenRandom.java
* Author: Nicole Donnelly
* Date: 20170805
* Purpose: Generate a user specified number of random integers
*/

import java.util.Random;

public class GenRandom {

  public static void main(String[] args) {
    
    // check for an argument, output that number of random ints
    if (args.length == 1) {
      int numRandom = Integer.parseInt(args[0]);
      
      // Construct a Random class instance
      Random randomGen = new Random();
      
      System.out.printf("\nHere are your %d random integers: \n", numRandom);
      for (int i=1; i<=numRandom; i++) {
        System.out.printf("\nNumber %d: %d", i, randomGen.nextInt());
      } // end for

    } // end if
    else {
      System.out.println("Please enter the number of random integers you would like to generate.");
      System.out.println("e.g. java GenRandom 8");
      System.exit(0);
  } // end else
 } // end main
} // end class
