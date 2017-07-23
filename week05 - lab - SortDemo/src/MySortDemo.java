/*
* File: MySortDemo.java
* Author: Nicole Donnelly
* Date: 20170723
* Purpose: This program demonstrates how to sort
* primitives using the selection sort
* and the Arrays quick sort algorithm
*/

// Import arrays to use quick sort
import java.util.Arrays;

public class MySortDemo {
  
//Define constant array size
static final int ARRAYSIZE = 50;

//Method from Notes for Selection Sort
public static void selectionSort(float[] array) {
    // Iterate for each position in the array. Note
    // that because <  (not <= ) is used,
    // i < (array.length - 1) iterates
    // i from 0 to (array.length - 2).
    for (int i = 0; i < (array.length - 1); i++) {

       int min = i;  

       // Find the smallest value in the array. Note that
       // after each pass, the smallest value is in place,
       // so the loop starts at the position following
       // the last pass in the loop.
       for (int j = i; j < (array.length); j++) {
         if (array[j] < array[min])
            min = j;
       } // end for

       // Swap the next selected array position
       // with the smallest value found on this pass.
       float temp = array[min];
       array[min] = array[i];
       array[i] = temp;
   } // end for
} // end method


  public static void main(String[] args) {
    
    // Create array of floats
    float[] floatValues = new float[ARRAYSIZE];
    // Assign random values 
    for (int i=0; i<floatValues.length; i++) {
      floatValues[i] = (float) Math.random() * 100;         
     } // end for
  
    System.out.println("******Unsorted float array*******");
    // Print the unsorted array
    for (int i=0; i<floatValues.length; i++) {
      System.out.println(floatValues[i]) ;        
     } //end for
    System.out.println("*****************************");

    // Call the Selection Sort method
    selectionSort(floatValues);

    System.out.println("******Selection Sorted float array*******");
    // Print the sorted array
    for (int i=0; i<floatValues.length; i++) {
      System.out.println(floatValues[i]);         
     }
    System.out.println("*****************************");
  
    // Create new unsorted array of floats
    // Assign random values 
    for (int i=0; i<floatValues.length; i++) {
      floatValues[i] = (float) Math.random() * 100;         
    } //end for
    
    System.out.println("******Unsorted float array*******");
    // Print the unsorted array
    for (int i=0; i<floatValues.length; i++) {
      System.out.println(floatValues[i]) ;        
    } //end for
    System.out.println("*****************************");
    
    //call Arrays.sort
    Arrays.sort(floatValues);
    
    System.out.println("******Arrays Sorted float array*******");
    // Print the sorted array
    for (int i=0; i<floatValues.length; i++) {
      System.out.println(floatValues[i]);         
     }
    System.out.println("*****************************");

  } //end main

} //end class
