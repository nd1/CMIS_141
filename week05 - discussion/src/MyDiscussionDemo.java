/*
* File: MyDiscussionDemo.java
* Author: Nicole Donnelly
* Date: 20170723
* Purpose: This program demonstrates the creation of a random length int array and print in sorted order
*/

// Import
import java.util.Arrays;
import java.util.Random;

public class MyDiscussionDemo {

//Main method
  public static void main(String args[]){
    
    // initialize the array to a random length from 1 - 20
    Random randomGen = new Random();
    int arraySize = randomGen.nextInt(21);
    int [] intArray = new int [arraySize];
    
    // populate the array with random numbers from 1 - 500
    for (int i=0; i<intArray.length; i++) {
      intArray[i] = randomGen.nextInt(501);
    } // end for
    
    // print the unsorted array
    System.out.println("Random Int Array Demo");
    System.out.printf("I have created an array of size %d of numbers from 1 - 500.\n", arraySize);
    System.out.println("******Unsorted array*******");
    // Print the unsorted array
    for (int i=0; i<intArray.length; i++) {
      System.out.println(intArray[i]) ;        
     } //end for
    System.out.println("*****************************");
    
    //sort the Array
    Arrays.sort(intArray);
    
    System.out.println("******Sorted array*******");
    // Print the sorted array
    for (int i=0; i<intArray.length; i++) {
      System.out.println(intArray[i]);         
     }
    System.out.println("*****************************");
    
    
  }
}
