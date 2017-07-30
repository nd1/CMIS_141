/*
* File: Circle2D.java
* Author: Nicole Donnelly
* Date: 20170729
* Purpose: This program creates a class for a 2d circle
*/

public class Circle2D {
  
  // Define a static class variable
  // Hold number of objects
  private static int numCircle2D = 0;
  
  //Define class variables
  private double xCenter = 0.0;
  private double yCenter = 0.0;
  private double radius = 1.0;
  
  // Constructors
  public Circle2D() {
    this(0.0, 0.0, 1.0);
  }
  
  public Circle2D(double xCenter, double yCenter, double radius) {
    this.xCenter = xCenter;
    this.yCenter = yCenter;
    this.radius = radius;
    numCircle2D++;
  }
  
  public Circle2D(double xCenter, double yCenter) {
    this(xCenter, yCenter, 1.0);
    this.xCenter = xCenter;
    this.yCenter = yCenter;
  }
  
  public Circle2D(double radius) {
    this(0.0, 0.0, radius);
    this.radius = radius;
  }
  
  // getter methods
  
  public double getNumCircle2D() {
    return numCircle2D;
  }
  
  public double getXCenter() {
    return xCenter;
  }
  
  public double getYCenter() {
    return yCenter;
  }
  
  public double getRadius() {
    return radius;
  }
  
  // setter methods
  
  public void setXCenter(double xCenter) {
    this.xCenter = xCenter;
  }
  
  public void setYCenter(double yCenter) {
    this.yCenter = yCenter;
  }
  
  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  // Area method
  public double getArea() {
     double area = Math.PI*Math.pow(radius,2);
     return area;
  }
  
  // Circumference method
  public double getCircumference() {
     double circumference = 2*Math.PI*radius;
     return circumference;
  }
}
