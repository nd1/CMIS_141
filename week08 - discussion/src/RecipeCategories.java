/**
 * File Name: RecipeCategories.java
 * Author: Jeanne Stokes
 * Date: 13 Aug 17
 * Purpose: Create your own unique Java application to read all data from the file echoing the data to standard output.
 * Updated by Nicole to write output to a file
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class RecipeCategories {
    public static void main(String[] args) {

        BufferedReader br;
        String line = "";
        String csvSplitBy = ",";
        String csvFile = "";
        File myOutFile = new File("output.txt");
        
        // Check to make sure we have command line argument
        if (args.length == 1) {
            csvFile = new String(args[0]); 
            } // end if 
        else {
          System.out.println("Application requires 1 command argument");
          System.out.println("e.g. java RecipeCategories Recipes.csv");
          System.exit(0);
          } // end else

        try {
            br = new BufferedReader(new FileReader(csvFile));
            if (myOutFile.exists()){  
              System.out.println("File exists, delete it!");
              System.exit(0);
            }
            PrintWriter fileOut = new PrintWriter(myOutFile);
            while ((line = br.readLine()) != null) {

            /* Use a comma as a separator */
                String[] category = line.split(csvSplitBy);
                
                fileOut.print(Arrays.toString(category));
            }
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
