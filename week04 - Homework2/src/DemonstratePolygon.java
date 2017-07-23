/* File: DemonstratePolygon.java
 * Author: Nicole Donnelly
 * Date: 20170714
 * Purpose:  accepts user input to construct instances the Polygon class and uses the methods
 */

import java.util.Scanner;

public class DemonstratePolygon {
  public static void main(String[] args)  { 
    
    // Demonstrate the default polygon
    
    // Use the Scanner class to input data
    Scanner scannerIn = new Scanner(System.in);
    System.out.println("Demonstrating the Polygon class with the default values.");
    
    Polygon defaultPoly = new Polygon();
    
    // demonstrate the polygon methods
    System.out.println();
    System.out.println("toString(): " + defaultPoly.toString());
    System.out.println("getNumSides(): " + defaultPoly.getNumSides());
    System.out.println("getSideLength(): " + defaultPoly.getSideLength());
    System.out.println("getXCoord(): " + defaultPoly.getXCoord());
    System.out.println("getYCoord(): " + defaultPoly.getYCoord());
    System.out.println("getPerimeter(): " + defaultPoly.getPerimeter(defaultPoly.getNumSides(),
        defaultPoly.getSideLength()));
    System.out.println();
    
    // Use a do while loop to create polygons and test the class methods
    int moreData = 0;
    do {
      System.out.println("Enter the requested values to create a polygon.");
      // get user input for number of sides
      System.out.print("Number of Sides (>=3): ");
      int numSides = scannerIn.nextInt();
   
      // get user input for length of sides
      System.out.print("Length of Sides (>0): ");
      double lengthSides = scannerIn.nextDouble();
      
      // get user input for x coordinate
      System.out.print("X Coordinate value: ");
      double xCoord = scannerIn.nextDouble();
      
      // get user input for y coordinate
      System.out.print("Y Coordinate value: ");
      double yCoord = scannerIn.nextDouble();
      
      // instantiate the polygon with the user values
      Polygon currentPoly = new Polygon(numSides, lengthSides, xCoord, yCoord);
      
      // demonstrate the polygon methods
      System.out.println();
      System.out.println("toString(): " + currentPoly.toString());
      System.out.println("getNumSides(): " + currentPoly.getNumSides());
      System.out.println("getSideLength(): " + currentPoly.getSideLength());
      System.out.println("getXCoord(): " + currentPoly.getXCoord());
      System.out.println("getYCoord(): " + currentPoly.getYCoord());
      System.out.println("getPerimeter(): " + currentPoly.getPerimeter(currentPoly.getNumSides(),
          currentPoly.getSideLength()));
      
      // see if the user wants to create another polygon
      System.out.println();
      System.out.print("Enter 1 to test another polygon or 0 to quit: ");
      moreData = scannerIn.nextInt();
    } while (moreData == 1);
    
    // close the scanner
    scannerIn.close();
    
  } // end main

} // end class
