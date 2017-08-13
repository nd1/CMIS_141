/**
 * File Name: RecipeCategories.java
 * Author: Jeanne Stokes
 * Date: 13 Aug 17
 * Purpose: Create your own unique Java application to read all data from the file echoing the data to standard output.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class RecipeCategories {
    public static void main(String[] args) {

        String csvFile = "C:\\Users\\Jeanne\\OneDrive\\School\\(01) Current\\CMIS 141 - Introduction to Programming\\Week 8\\Completed Work\\Discussion Boards\\Recipes.csv";
        BufferedReader br;
        String line = "";
        String csvSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

            /* Use a comma as a separator */
                String[] category = line.split(csvSplitBy);

                System.out.printf("%10.10s  %10.10s  %10.10s  %10.10s  %10.10s  %10.10s  %10.10s  %10.10s  %10.10s  %10.10s  %10.10s  \n", category[0], category[1], category[2], category[3], category[4], category[5], category[6], category[7], category[8], category[9], category[10]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
