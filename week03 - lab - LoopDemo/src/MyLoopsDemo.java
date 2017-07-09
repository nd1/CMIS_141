/*
* File: MyLoopsDemo.java
* Author: Nicole Donnelly
* Date: 20170708
* Purpose: This program demonstrates the use of loops.
*/

public class MyLoopsDemo {
  public static void main(String[] args)  {     
    
    int MINBYTE = -128;
    int MAXBYTE = 127;
    int counter = 0;
    
    // print all of the available byte values from -128 to 127 with a while loop
    System.out.println("While loop demo");
    int currentVal = MINBYTE;
    while (currentVal <= MAXBYTE) {
      if (counter < 9) {
        System.out.print(currentVal + "\t");
        counter++;
      } // end if
      else {
        System.out.print(currentVal + "\n");
        counter = 0;
      } // end else
      currentVal++;
    } // end while
    
    // print all of the available byte values from -128 to 127 with a do while loop
    counter = 0;
    System.out.println("\n");
    System.out.println("Do-While demo");
    currentVal=MINBYTE;    
    do {
      if (counter < 9) {
        System.out.print(currentVal + "\t");
        counter++;
      } // end if
      else {
        System.out.print(currentVal + "\n");
        counter = 0;
      } // end else
      currentVal++;
    } while (currentVal <= MAXBYTE);
    
    // print all of the available byte values from -128 to 127 with a for loop
    counter = 0;
    System.out.println("\n");
    System.out.println("For demo");
    for (currentVal=MINBYTE; currentVal<=MAXBYTE; currentVal++) {
      if (counter < 9) {
        System.out.print(currentVal + "\t");
        counter++;
      } // end if
      else {
        System.out.print(currentVal + "\n");
        counter = 0;
      } // end else
    } // end for
    
  } // end main

} // end MyLoopsDemo
