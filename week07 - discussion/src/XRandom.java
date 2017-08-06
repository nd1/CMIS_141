/*
* File: XRandom.java
* Author: Nicole Donnelly
* Date: 20170805
* Purpose: Generate x random numbers between 0 and y
*/

import java.util.Random;

public class XRandom {

  public static void main(String[] args) {
 
    // check for args, generate random numbers
    if (args.length == 2) {
      int x = Integer.parseInt(args[0]);
      int y = Integer.parseInt(args[1]);
      
      // Construct a Random class instance
      Random randomGen = new Random();
      
      System.out.printf("\nHere are your %d random integers between 0 and %d: \n", x, y);
      for (int i=1; i<=x; i++) {
        System.out.printf("\nNumber %d: %d", i, randomGen.nextInt(y));
      } // end for

    } // end if
    else {
      System.out.println("Please enter two integer arguments.");
      System.out.println("e.g. java XRandom 8 88");
      System.exit(0);
  } // end else
    

  } // end main

} // end class
