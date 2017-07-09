/*
* File: MyRandomDemo.java
* Author: Nicole Donnelly
* Date: 20170708
* Purpose: This program demonstrates the use of Random
*/

import java.util.Random;

public class MyRandomDemo {
  public static void main(String[] args)  { 
    
    System.out.println("Here are your MegaMillions numbers:");
    
    // Construct a Random class instance
    Random randomGen = new Random();
    
    // Pick 5 numbers from 1-75, and 1 number 1-15
    int pick1 = randomGen.nextInt(76);
    int pick2 = randomGen.nextInt(76);
    int pick3 = randomGen.nextInt(76);
    int pick4 = randomGen.nextInt(76);
    int pick5 = randomGen.nextInt(76);
    int bonus = randomGen.nextInt(16);
    
    System.out.println(
        "Pick 1: " + pick1 + "\n" +
        "Pick 2: " + pick2 + "\n" +
        "Pick 3: " + pick3 + "\n" + 
        "Pick 4: " + pick4 + "\n" +
        "Pick 5: " + pick5 + "\n" + 
        "Bonus Pick: " + bonus + "\n");
    
    
  }

}
