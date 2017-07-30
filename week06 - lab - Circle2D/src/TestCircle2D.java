/* File: TestCircle2D.java
* Author: Nicole Donnelly
* Date: 20170729
* Purpose: This program test the circle2D class
*/

public class TestCircle2D {
  
  public static void main(String[] args)  {
    
    // array of circles
    Circle2D [] testCircles = new Circle2D[5];
    
    
    // construct 5 test circles
    testCircles[0] = new Circle2D(2.0, 4.0, 2.5);
    testCircles[1] = new Circle2D();
    testCircles[2] = new Circle2D(3.0, 3.0);
    testCircles[3] = new Circle2D(3.3);
    testCircles[4] = new Circle2D(5.6, 2.3, 7.9);
    
    System.out.println("Total Circles are: " + testCircles[0].getNumCircle2D() );
    
    for (int i=0; i< testCircles.length; i++) {
      System.out.println("Circle " + (i+1) + " XCenter, YCenter, and Radius: " 
          + testCircles[i].getXCenter() + ", " + testCircles[i].getYCenter() + ", " + 
          testCircles[i].getRadius());
      System.out.println("Circle " + (i+1) + "Area: " + testCircles[i].getArea());
      System.out.println("Circle " + (i+1) + "Circumference: " + testCircles[i].getCircumference());
    }
    
  }

}
