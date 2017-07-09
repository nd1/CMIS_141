/*
* File: MyRandomDemo.java
* Author: Nicole Donnelly
* Date: 20170708
* Purpose: This program demonstrates the use of nest loops
*/

public class MyNestedLoopsDemo {
  public static void main(String[] args)  { 

    // sum the multiplication tables from 11 to 99.
    // print the final sum and average
    
    // create variables for the table
    int MINROW = 11;
    int MAXROW = 99;
    int MAXCOLUMN = 99;
    int loopCount = 0;
    int productSum = 0;
    
    System.out.println("Multiplication Table Nested Summation for 11-99");
    for (int rowCount=MINROW; rowCount<=MAXROW; rowCount++) {
      for (int colCount=MINROW; colCount<=MAXCOLUMN; colCount++) {
        productSum += rowCount*colCount;
        loopCount++;
      } // end colCount loop
    } // end rowCount loop
    
    System.out.println("The sum is: " + productSum);
    System.out.println("The average is: " + productSum/loopCount);
    
  } // end main
} // end MyNestedLoopsDemo
