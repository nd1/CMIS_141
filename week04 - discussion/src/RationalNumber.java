/*
* File: RationalNumber.java
* Author: Nicole Donnelly
* Date: 20170714
* Purpose: Any number can be expressed as the quotient or fraction p/q
* of two integers, p and q, with the denominator q not equal to zero.
* Since q may be equal to 1, every integer is a rational number.
* Addition:        n1/d1 + n2/d2 = (n1*d2 + n2*d1)/(d1*d2)
* Subtraction:     n1/d1 - n2/d2 = (n1*d2 - n2*d1)/(d1*d2)
* Multiplication:  n1/d1 * n2/d2 = (n1*n2)/(d1*d2)
* Division:        (n1/d1) / (n2/d2) = (n1*d2)/(d1*n2)
*/
public class RationalNumber {
  private long numerator;
  private long denominator;
  
  // Constructor
  public RationalNumber (long n, long d) {
    numerator = n;
    denominator = d;
  }
  
  // default Constructor
  public RationalNumber () {
    numerator = 1;
    denominator = 1;
  }
  
  // Getter Methods
  // get numerator
  public long getNumerator () {
    return numerator;
  }
  // get denominator
  public long getDenominator () {
    return denominator;
  }
  
  // Methods for addition, subtraction, multiplication, and division
  // add two rational numbers
  public RationalNumber addRatNum (RationalNumber other) {
    // initialize a variable for the result
    RationalNumber newRatNum = new RationalNumber();
    
    // compute the new numerator and denominator
    newRatNum.numerator = numerator * other.getDenominator() +
        denominator * other.getNumerator();
    newRatNum.denominator = denominator * other.getDenominator();
    
    // return the new RationalNumber
    return newRatNum;
  }
  
  // subtract two rational numbers
  public RationalNumber subtractRatNum (RationalNumber other) {
    // initialize a variable for the result
    RationalNumber newRatNum = new RationalNumber();
    
    // compute the new numerator and denominator
    newRatNum.numerator = numerator * other.getDenominator() -
        denominator * other.getNumerator();
    newRatNum.denominator = denominator * other.getDenominator();
    
    // return the new RationalNumber
    return newRatNum;
  }
  
  //multiply two rational numbers
  public RationalNumber multiplyRatNum (RationalNumber other) {
    // initialize a variable for the result
    RationalNumber newRatNum = new RationalNumber();
    
    // compute the new numerator and denominator
    newRatNum.numerator = numerator * other.getNumerator();
    newRatNum.denominator = denominator * other.getDenominator();
    
    // return the new RationalNumber
    return newRatNum;
  }
  
  //divide two rational numbers
  public RationalNumber divideRatNum (RationalNumber other) {
    // initialize a variable for the result
    RationalNumber newRatNum = new RationalNumber();
    
    // compute the new numerator and denominator
    newRatNum.numerator = numerator * other.getDenominator();
    newRatNum.denominator = denominator * other.getNumerator();
    
    // return the new RationalNumber
    return newRatNum;
 }
  
  //toString method
  public String toString() {
  // display the Rational number as a string "n/d"
  String str = numerator + "/" + denominator;
  return str;
  }

} // end class
