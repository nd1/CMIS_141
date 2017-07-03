/* File: MyHomeworkOne.java
 * Author: Nicole Donnelly
 * Date: 20170701
 * Purpose:   read user input then display the data entered along with some 
 * conversions and calculations
 */

//Import statements
import java.util.Scanner;

public class MyHomeworkOne {
  public static void main(String[] args) {

    //Use the Scanner class to input data
    Scanner scannerIn = new Scanner(System.in);
    
    // Prompt the user to enter student emplid, scan the value
    System.out.print("Enter your Student EMPLID (0 - 999999): ");
    int studentEmplid = scannerIn.nextInt();
    
    // Prompt the user to enter quiz1 score, scan the value
    System.out.print("Enter your quiz1 percentage score (0.0 – 100.0): ");
    double quiz1 = scannerIn.nextDouble();
    
    // Prompt the user to enter quiz2 score, scan the value
    System.out.print("Enter your quiz2 percentage score (0.0 – 100.0): ");
    double quiz2 = scannerIn.nextDouble();
    
    // Prompt the user to enter quiz3 score, scan the value
    System.out.print("Enter your quiz3 percentage score (0.0 – 100.0): ");
    double quiz3 = scannerIn.nextDouble();
    
    // Prompt the user to enter age in months, scan the value
    System.out.print("Enter your age in months (0-1440): ");
    short ageInMonths = scannerIn.nextShort();
    
    // Prompt the user to enter temp in celsius, scan the value
    System.out.print("Enter the current Temperature in degrees Celsius: ");
    double tempCelsius = scannerIn.nextDouble();
    
    // Display data and calculations/ conversions
    System.out.println("\n\n*** Thank you ***");
    
    // Check that the  student emplid is valid, alert user if it is not
    if (studentEmplid >=0 && studentEmplid <= 999999) {
      System.out.println("Student EMPLID: " + studentEmplid);
      }
    else {
      System.out.println("Student EMPLID: " + studentEmplid + " (Student EMPLID is not valid)");
    }
    
    // Check that quiz values are in range, alert user if not and still compute average
    if (quiz1 >= 0.0 && quiz1 <= 100.0) {
      System.out.println("Quiz 1 Score: " + quiz1);
    }
    else {
      System.out.println("Quiz 1 Score: " + quiz1  + " (Score is out of range. Average will still "
          + "be computed.)");
    }
    
    if (quiz2 >= 0.0 && quiz2 <= 100.0) {
      System.out.println("Quiz 2 Score: " + quiz2);
    }
    else {
      System.out.println("Quiz 2 Score: " + quiz2  + " (Score is out of range. Average will still "
          + "be computed.)");
    }
    
    if (quiz3 >= 0.0 && quiz3 <= 100.0) {
      System.out.println("Quiz 3 Score: " + quiz3);
    }
    else {
      System.out.println("Quiz 3 Score: " + quiz3  + " (Score is out of range. Average will still "
          + "be computed.)");
    }
    
    // compute and print quiz average
    double avgScore = (quiz1 + quiz2 + quiz3) / 3.0;
    
    // I wanted to round the average to one decimal place
    // I followed a method I found on StackOverflow and modified it for one decimal place
    // https://stackoverflow.com/questions/5710394/how-do-i-round-a-double-to-two-decimal-places-in-java
    avgScore = Math.round(avgScore * 10);
    System.out.println("Average quiz score: " + (avgScore / 10));
    
    // print age in months compute and print age in years
    System.out.println("Age in months: " + ageInMonths);
    
    // compute and print age in years
    if ((ageInMonths / 12) > 120) {
      System.out.println("Age in years: " + (ageInMonths /12) + " You look amazing!");
    }
    else if ((ageInMonths / 12) < 0) {
      System.out.println("Age in years: " + (ageInMonths /12) + " Did you make a mistake?");
    }
    else {
      System.out.println("Age in years: " + (ageInMonths /12));
    }
    
    // print temp Celsius compute and print temp F using rounding method described above
    System.out.println("Temperature in Celsius: " + tempCelsius + "º");
    
    //compute and print temp F using rounding method described above
    double tempFarenheit = Math.round((tempCelsius * 9.0 / 5.0 + 32.0) * 10);
    System.out.println("Temperature in Farenheit: " + (tempFarenheit / 10) + "º");
   
    // close the scanner
    scannerIn.close();
    
  } // end main
} // end 
