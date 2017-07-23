/*
* File: MyArrayDemo.java
* Author: Nicole Donnelly
* Date: 20170722
* Purpose: This program demonstrates the creation
* and use of Java arrays
*/

import java.util.Random;

public class MyArrayDemo {
  
//Define constant array size
static final int ARRAYSIZE = 50;
static final int BOOLARRAYSIZE = 100;

  //Main method
  public static void main(String args[]){
    
    //array of ints
    int [] intValues = new int[ARRAYSIZE];
    for (int i=0; i<intValues.length; i++) {
      intValues[i] = (int) (Math.random() * 101) - 50;
    } //end int for
      
    //array of booleans
    Boolean [] booleanValues = new Boolean[BOOLARRAYSIZE];
    Random randomBool = new Random();
    for (int i=0; i<booleanValues.length; i++) {
      booleanValues[i] = randomBool.nextBoolean();
    } //end boolean for
    
    // Display the results
    System.out.println("Int values");
    for (int i=0; i<intValues.length; i++) {
            // Print new line every 10 items
            if ((i % 10)==0  ) {
        System.out.println("");
            }
    System.out.print(intValues[i] +"\t");
    } //end int display for
    
    System.out.println("\n\n");
    
    System.out.println("Boolean values");
    for (int i=0; i<booleanValues.length; i++) {
            // Print new line every 10 items
            if ((i % 10)==0  ) {
        System.out.println("");
            }
    System.out.print(booleanValues[i] +"\t");
    
    } //end boolean display for
  } //end main

} //end class
