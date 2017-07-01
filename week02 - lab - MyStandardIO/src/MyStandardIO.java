/* File: MyStandardIO.java
 * Author: Nicole Donnelly
 * Date: 20170630
 * Purpose: Demonstrate use of standard input
 */


// Import each required Java class
import java.io.IOException;
import java.util.Scanner;

public class MyStandardIO {
  
  public static void main(String[] args) throws IOException {
    
    // Use the scanner class to read input
    Scanner scannerIn = new Scanner(System.in);
    
    // Prompt the user to enter their age, scan the value
    System.out.println("Enter your age:");
    byte userAge = scannerIn.nextByte();
    
    // Prompt the user to enter their address latitude, scan the value
    System.out.println("Enter the latitude of your address. Need help? "
        + "https://support.google.com/maps/answer/18539?co=GENIE.Platform%3DDesktop&hl=en");
    float addressLatitude = scannerIn.nextFloat();
    
    // Prompt the user to enter their address longitude, scan the value
    System.out.println("Enter the longitude of your address. Need help? "
        + "https://support.google.com/maps/answer/18539?co=GENIE.Platform%3DDesktop&hl=en");
    float addressLongitude = scannerIn.nextFloat();
    
    // Prompt the user to enter ~ number of stars, scan the value
    System.out.println("Enter the approximate number of stars in the galaxy.");
    long numberStars = scannerIn.nextLong();
    
    // Prompt the user to enter the maximum value of a short, scan the value
    System.out.println("Enter the maximum value Java can store as a short. "
        + "(Hint: the range for short is -32,768 to 32,767.)");
    short maxShort = scannerIn.nextShort();
    
   // Prompt the user to answer true or false, scan the value
    System.out.println("True or False: Are you stressed out?");
    boolean stressedOut = scannerIn.nextBoolean();
    
    // Tell the user what they entered
    System.out.println("Your age is: " + userAge);
    System.out.println("The latitude of your address is: " + addressLatitude);
    System.out.println("The longitude of your address is: " + addressLongitude);
    System.out.println("The approximate number of stars in the galaxy is: " + numberStars);
    System.out.println("The maximum short value Java can store is: " + maxShort);
    System.out.println("Are you stressed out? " + stressedOut);
    
    // close the scanner
    scannerIn.close();
  
  }

}
