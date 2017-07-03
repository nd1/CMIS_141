/* File: MyRandomNumber.java
 * Author: Nicole Donnelly
 * Date: 20170703
 * Purpose: provide changes to code posted by a classmate that demonstrates a for or while loop
 * This code was originally written by Felix Amaro as a for loop to generate a random float and 
 * add integer of 1, then increment 10 times. Control decimal output to 5 places.
 * I changed it to a while loop.
 */

// imports
import static java.lang.Math.random;                          

public class MyRandomNumber{
  public static void main(String[] args) {
    sendRandomNumber(); // call random number method
    }
  
  private static void sendRandomNumber() {
    
    // declare myRandom from Math.random() method
    float myRandom = (float)(random());    
    // use increment to count loop and increment value
    int increment = 1;
    
    while (increment <= 10) { 
      
      //print add 1 to myRandom float number
      System.out.print("My random number " + increment + " is: ");    
      
      //control output to 5 decimal places
      System.out.printf("%.5f", (myRandom + increment));       
      
      //force next line after print format method
      System.out.print("\n");
      
      //increase increment
      increment++;
      
      } // end while
    } //end of sendRandomNumber()
  } //end of class