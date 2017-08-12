/*
 * File: ReadEmails.java
 * Author: Nicole Donnelly
 * Date: 20170811
 * Purpose: This program demonstrates
 * reading data from a file
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadEmails {

  public static void main(String[] args) {
    BufferedReader inputStream = null;
    String fileLine;
    
    try {
      // Separate the file output
      System.out.println("");
      // Use of 
      inputStream = new BufferedReader(new FileReader("EmailAddresses.txt"));

      System.out.println("EmailAddresses.txt Contents");
     // Read one Line using BufferedReader
      while ((fileLine = inputStream.readLine() ) != null) {
          System.out.println(fileLine);
       } // end while 
      
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

  } //end main

} // end read emails
