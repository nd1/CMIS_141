/*
* File: MySearchDemo.java
* Author: Nicole Donnelly
* Date: 20170723
* Purpose: This program demonstrates how to search
* primitives using the 
* Arrays binary search algorithm
*/

// Import
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MySearchDemo {
  
//Define constant array size
static final int ARRAYSIZE = 20;

  public static void main(String[] args) {
   
   // Create array of ints
    int[] intValues = new int[ARRAYSIZE];
    
    // Assign random values from 1-100
    Random randomGen = new Random();
    for (int i=0; i<intValues.length; i++) {
      intValues[i] = randomGen.nextInt(101); 
      } // end for
    
    // Sort the int array value 
    Arrays.sort(intValues);
    
    
    // Prompt the user to enter a value to search for
    Scanner scannerIn = new Scanner(System.in);
    System.out.println("I have created an array of 20 random numbers between 1 and 100.");
    System.out.println("******Sorted int array*******");
    // Print the sorted array
    for (int i=0; i<intValues.length; i++) {
     System.out.println("index is " + i + "," + "value is " + intValues[i]) ;        
       }
    System.out.println("*****************************");
    System.out.println("Which value do you want the index value for?  ");
    int searchValue = scannerIn.nextInt();
    
    System.out.println("Searching for: " + searchValue);
    
    // Search for the value
    int arrIndex = Arrays.binarySearch(intValues, searchValue);
    
    if (arrIndex < 0) {
      System.out.printf("%d was not found in the array.", searchValue);
    } //end if
    else {
      System.out.printf("The index with value %d is %d", searchValue, arrIndex);   
    }
    
    // close the scanner
    scannerIn.close();
    

  } //end main
} //end class
