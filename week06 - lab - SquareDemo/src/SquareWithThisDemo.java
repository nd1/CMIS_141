/*
* File: SquareWithThisDemo.java
* Author: Nicole Donnelly
* Date: 20170729
* Purpose: This program demonstrates the scope
* of class and local variables and use of this
*/

public class SquareWithThisDemo {
  //Define a static class variable
  // Hold number of objects
  private static int numSquares = 0;
  // Define class variable
  private double length = 1.0;

  //Constructors
  // Default constructor
  public SquareWithThisDemo() {
    this(1.0);
       }
  
  public SquareWithThisDemo (double l) {
    this.length = l;
    numSquares++;
    }
  
  // Area method
  public double getArea() {
    double area = Math.pow(length,2);
    return area;
  }
  
  // Perimeter method
  public double getPerimeter() {
    double perimeter = length*4;
    return perimeter;
  }
  
  // getter method
  public double getlength() {
     return this.length;
  } 
  
  public static int getNumSquares() {
     return numSquares;
  } 

  // setter method
  public void setLength(double length) {
    this.length = length; 
  } 

} // end class

