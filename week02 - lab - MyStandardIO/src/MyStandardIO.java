/* File: MyStandardIO.java
 * Author: Nicole Donnelly
 * Date: 20170630
 * Purpose: Demonstrate use of standard input
 */

//in progress

// Import each required Java class
import java.io.IOException;
import java.util.Scanner;

public class MyStandardIO {
  
  public static void main(String[] args) throws IOException {
    
    // Use the scanner class to read input
    Scanner scannerIn = new Scanner(System.in);
    
    // Prompt the user to enter their age, scan the value
    System.out.println("Enter your age:")
    byte age = scannerIn.nextByte();
    
  }

}
