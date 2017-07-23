import java.util.Random;

/*
* File: MultiDimensionDemo.java
* Author: Nicole Donnelly
* Date: 20170723
* Purpose: This program demonstrates how to create
* and populate a 3D array in Java
*/
public class My3DDemo {
  
//Define constant array size
static final int DIMENSIONONE = 5;
static final int DIMENSIONTWO = 20;
static final int DIMENSIONTHREE = 10;

  //Main method
  public static void main(String args[]){
    
    // create 3D array of ints between 1 and 30
    int [][][] int3D = new int [DIMENSIONONE][DIMENSIONTWO][DIMENSIONTHREE];
    Random randomGen = new Random();
    
    for (int z=0; z<DIMENSIONONE; z++) {
      for (int x=0; x<DIMENSIONTWO; x++){
        for (int y=0; y<DIMENSIONTHREE; y++) {
          int3D[z][x][y] = randomGen.nextInt(31); 
        } // end for y
      } // end for x
    } // end for z
    
    // print table with 10 columns
    
    for (int z=0; z<DIMENSIONONE; z++) {
      System.out.println("Dimension " + z); 
 
           for (int x=0; x<DIMENSIONTWO; x++) {  
        for (int y=0; y<DIMENSIONTHREE; y++) {                       
         System.out.print(int3D[z][x][y] + "\t");    
           } // end for y
             System.out.println(""); 
         }  // end for x                      
       } // end for z
    
  
  } // end main
} //end class

