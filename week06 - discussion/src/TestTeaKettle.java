/*
* File: TestTeaKettle.java
* Author: Nicole Donnelly
* Date: 20170730
* Purpose: Test the TeaKettle class
*/
public class TestTeaKettle {

  public static void main(String[] args) {
    
    TeaKettle defaultKettle = new TeaKettle();
    System.out.println("The default kettle.");
    System.out.println(defaultKettle.toString());
    
    // make 1L green tea
    System.out.println("\nLet's make 1L of water for green tea.");
    TeaKettle greenTea = new TeaKettle(175, 1.0);
    System.out.print(greenTea.toString());
    
    // .75 liter for french press
    System.out.println("\nLet's make water for coffee in the French Press.");
    TeaKettle frenchPress = new TeaKettle(200, .75);
    System.out.print(frenchPress.toString());
    
    // make .5L oolong tea
    System.out.println("\nLet's make .5L of water for oolong tea.");
    TeaKettle oolongTea = new TeaKettle(190, .5);
    System.out.print(oolongTea.toString());
    
    // change to black tea
    System.out.println("\nI meant to make black tea. Change the temperature"
        + " and don't keep it warm after.");
    oolongTea.setTemp(212);
    oolongTea.setWarm(false);
    System.out.print(oolongTea.toString());

  } // end main

} //end class
