/*
 * File: GroceryList.java
 * Author: Nicole Donnelly
 * Date: 20170811
 * Purpose: read all data from the file echoing the data to standard output. 
 * After all data has been read, display how many data were read. 
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GroceryList {

  public static void main(String[] args) {
    
    BufferedReader inputStream = null;
    String fileLine;
    int itemCount = 0;
    
    try {
      // Separate the file output
      System.out.println("");
      // Use of 
      inputStream = new BufferedReader(new FileReader("MyGroceryList.txt"));

      System.out.println("Please buy the following items at the store:");
     // Read one Line using BufferedReader
      while ((fileLine = inputStream.readLine() ) != null) {
          System.out.println(fileLine);
          itemCount++;
       } // end while 
      System.out.printf("\nYou need to buy %d items.\n", itemCount);
    } // end try
    
    catch (IOException io) {
      System.out.println("File IO exception" + io.getMessage());

    } // end catch
    finally {
      // Need another catch for closing 
      // the streams          
      try {
          // Close the streams
          if (inputStream != null) {
          inputStream.close();
      } // end if
          
      } // end try 
      catch (IOException io) {
          System.out.println("Issue closing the Files" + io.getMessage());
      }// end catch
      
    } // end try

  } // end main

} // end grocery list
