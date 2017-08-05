/*
* File: TestHeadPhone.java
* Author: Nicole Donnelly
* Date: 20170730
* Purpose: test the headphone class
*/
public class TestHeadPhone {

  public static void main(String[] args) {
    
    // create an array for the headphone test cases
    HeadPhone [] testHeadPhones = new HeadPhone[4];
    
    // add headphones to the array
    // default headphone instance
    testHeadPhones[0] = new HeadPhone();
    // fully parameterized instance
    testHeadPhones[1] = new HeadPhone(HeadPhone.HIGH, true, "Bose", "silver", "QuietComfort 35 Wireless");
    // partial parameterized instance
    testHeadPhones[2] = new HeadPhone("SkullCandy", "magenta", "Jib Wireless Earbud");
    // my headphones
    testHeadPhones[3] = new HeadPhone(HeadPhone.LOW, true, "Klipsch", "black", "Klipsch S4i In‑Ear Noise Isolating Headphones");
    
    // demonstrate the methods for each instance
    for (int i=0; i<testHeadPhones.length; i++) {
      
      // use the toString method
      System.out.printf("\nHeadPhones %d", (i+1));
      System.out.println(testHeadPhones[i].toString());
      
      // use the getter methods to get information
      System.out.println("\nUse the getter methods.");
      System.out.println("Volume: " + testHeadPhones[i].getVolume() +
                "\nPlugged In: " + testHeadPhones[i].getPluggedIn() +
                "\nManufacturer: " + testHeadPhones[i].getManufacturer() + 
                "\nColor: " + testHeadPhones[i].getColor() + 
                "\nModel: " + testHeadPhones[i].getModel());
      
      // use the setter methods to change the information
      System.out.println("\nChange values using the setter methods.");
      testHeadPhones[i].setVolume(HeadPhone.LOW);
      testHeadPhones[i].setPluggedIn(true);
      testHeadPhones[i].setManufacturer("NewManufaturer");
      testHeadPhones[i].setColor("orange");
      testHeadPhones[i].setModel("NewModel");
      System.out.println(testHeadPhones[i].toString());
      
      // use the changeVolume method
      System.out.println("\nChange the Volume to high using the change volume method.");
      System.out.println("testHeadPhones[i].setVolume(HeadPhone.HIGH);");
      testHeadPhones[i].setVolume(HeadPhone.HIGH);
      System.out.println("The new volume is: " + testHeadPhones[i].getVolume());
      
    } // end for loop
  
  } // end main

} // end class
