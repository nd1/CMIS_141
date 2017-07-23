/* File: Polygon.java
 * Author: Nicole Donnelly
 * Date: 20170714
 * Purpose:  construct instances and methods of the Polygon class
 */

import java.lang.IllegalArgumentException;

public class Polygon {
  
  private int numSides = 4;
  private double sideLength = 5.0;
  private double xCoord = 0.0;
  private double yCoord = 0.0;
  private double perimeter;
  
  // Default constructor, using default values
  public Polygon () {
    // leaving the no arg constructor empty instantiates with default values above
    }
  
  // Constructor
  public Polygon (int numSides, double sideLength, double xCoord, double yCoord) {
    
    // create an exception if numSides < 3
    if (numSides < 3) {
      throw new IllegalArgumentException ("A polygon must have 3 or more sides.");
    }
    this.numSides = numSides;
    
    // create an exception if sideLength <= 0
    if (sideLength <= 0) {
      throw new IllegalArgumentException ("Side length must be greater than 0.");
    }
    this.sideLength = sideLength;
    
    // xCoord and yCoord can be any double value
    this.xCoord = xCoord;
    this.yCoord = yCoord;
  }
  
  // Getter methods
  // get numSides
  public int getNumSides () {
    return numSides;
  }
  
  // get sideLength
  public double getSideLength () {
    return sideLength;
  }
  
  // get xCoord
  public double getXCoord () {
    return xCoord;
  }
  
  // get yCoord
  public double getYCoord () {
    return yCoord;
  }
  
  // method to compute the perimeter
  public double getPerimeter (int sides, double length) {
    perimeter = sides * length;
    return perimeter;
  }
  
  //toString method
  public String toString() {
    String str = "(numSides=" + numSides + ", sideLength=" + sideLength + 
        ", xCoord=" + xCoord + ", yCoord=" + yCoord + ")";
    return str;
  }

}
