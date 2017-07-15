/*
* File: TestRationalNumber.java
* Author: Nicole Donnelly
* Date: 20170714
* Purpose: This program constructs instances
* of the RationalNumber class and uses
* its methods
*/
public class TestRationalNumber {
  public static void main(String[] args)  { 
    
    // construct a rational number 1/2
    RationalNumber r1 = new RationalNumber(1, 2);
    
    // construct a default rational number
    RationalNumber r2 = new RationalNumber();
    
    // call the getter methods
    long r1N = r1.getNumerator();
    long r1D = r1.getDenominator();
    long r2N = r2.getNumerator();
    long r2D = r2.getDenominator();
    
    // print getter method results
    System.out.println("r1 numerator: " + r1N);
    System.out.println("r1 denominator: " + r1D);
    System.out.println("r2 numerator: " + r2N);
    System.out.println("r2 denominator: " + r2D);
    
    // call the addRatNum method
    RationalNumber addition = r1.addRatNum(r2);
    System.out.println("r1 + r2 = " + addition);
    
    // call the subtractRatNum method
    RationalNumber subtraction = r1.subtractRatNum(r2);
    System.out.println("r1 - r2 = " + subtraction);
    
    // call the multiplyRatNum method
    RationalNumber multiplication = r1.multiplyRatNum(r2);
    System.out.println("r1 * r2 = " + multiplication);
    
    // call the multiplyRatNum method
    RationalNumber division = r1.divideRatNum(r2);
    System.out.println("r1 / r2 = " + division);
    
    // Display the values using toString
    System.out.println(r1.toString());
    System.out.println(r2.toString());
    
  }

}
