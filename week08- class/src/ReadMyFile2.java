/*
Name: Felix Amaro
Week Number: 8
File Name: ReadMyFile2.java
Description: Read characters from file, count characters and print to screen
*/

import java.io.BufferedReader; //needed for buffer read
import java.io.File; //needed to open file
import java.io.FileNotFoundException; //needed if file not found catch
import java.io.FileReader; //needed to file reader
import java.io.IOException; //needed for input/output catch

public class ReadMyFile2 {
  // ***********************Main Method**************************
  public static void main(String[] args) throws IOException {
    File readMe = new File("/Users/nicole/Documents/workspace/CMIS 141/week08- class/ReadMyFile2.txt"); // instantiate File to read
    FileReader readYou = new FileReader(readMe); // instantiate FileReader
    BufferedReader buffer = new BufferedReader(readYou); // instantiate buffer to read file
    int runFile = 0;
    int charCount = 0;
    try {
      while ((runFile = buffer.read()) != -1) { // loop read to file from
        // buffer
        System.out.print((char) runFile); // print loop character one at
        // a time
        charCount = countChar(charCount);
      }

      buffer.close(); // close readFile to free resources

      System.out.println("\n*************************");
      System.out.println("Total character count: " + charCount); // print

      // character
      // count
    } 
    catch (FileNotFoundException errorFileExemption) { // throw file not found error
      errorFileExemption.printStackTrace();
    } 
    catch (IOException errorIOExemption) { // throw input/output error
      errorIOExemption.printStackTrace();
    }
  }// end of main method

  // ************************charCount Method*********************

  private static int countChar(int charCount) {

    return ++charCount;
    }
}// end of ReadMyFile2 class