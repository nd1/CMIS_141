/*
 * File: USCrime.java
 * Author: Nicole Donnelly
 * Date: 20170813
 * Purpose: Given a crime data csv file with a known format and header row, create an array of the data
 * and run computations on the data. 
*/

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class USCrimeApp {

  public static void main(String[] args) {

    String fileName = "";
    Instant start = Instant.now(); //start time
    
    // Check to make sure we have command line argument
    if (args.length == 1) {
        fileName = new String(args[0]); 
        } // end if 
    else {
        System.out.println("Application requires 1 command arguments");
        System.out.println("e.g. java USCrime crime.csv");
        System.exit(0);
        } // end else

      USCrimeArray myCrimes = new USCrimeArray(fileName); // create the data array
      appMenu(myCrimes); // user interaction menu
      
      Instant end = Instant.now();      // end time
      System.out.println("Elapsed time in seconds was: "+ 
           Duration.between(start, end).toNanos()/1_000_000_000.0);

  } // end main
  
  private static void appMenu(USCrimeArray crimes) {
    // user interaction with data
    Scanner scannerIn = new Scanner(System.in);
    
    System.out.println("********** Welcome to the US Crime Statistical Application **************************");
    while (true) {
      System.out.println("");
      System.out.println("\nEnter the number of the question you want answered. Enter ‘Q’ to quit the program.\n"
          + "\n1. What were the percentages in population growth for each consecutive year from 1994 – 2013?" 
          + "\n2. What are all the values for each year from 1994 – 2013??"
          + "\n3. What year was the Murder rate the highest?"
          + "\n4. What year was the Murder rate the lowest?"
          + "\n5. What year was the Robbery rate the highest?"
          + "\n6. What year was the Robbery rate the lowest?"
          + "\n7. What year was the Rape rate the highest?"
          + "\n8. What year was the Rape rate the lowest?"
          + "\n9. What year was the Aggravated Assault rate the highest?"
          + "\n10. What year was the Aggravated Assault rate the lowest?"
          + "\n11. What year was the Burglary rate the highest?"
          + "\n12. What year was the Burglary rate the lowest?"
          + "\n13. What year was the Larceny theft rate the highest?"
          + "\n14. What year was the Larceny theft rate the lowest?"
          + "\n15. What year was the Motor Vehicle theft rate the highest?"
          + "\n16. What year was the Motor Vehicle theft rate the lowest?"
          + "\n17. How many total crimes were committed each year from 1994 – 2013 (violent + property)?"
          + "\n18. How many violent crimes were committed each year from 1994 - 2013?"
          + "\n19. What was the change in violent crime rate for each consecutive year from 1994 – 2013?"
          + "\n20. How many property crimes were committed each year from 1994 - 2013?"
          + "\n21. What was the change in property crime rate for each consecutive year from 1994 – 2013?"
          + "\nQ. Quit the program"
          + "\nEnter your selection:");
      
      // read the next line, normalize the string for comparison
      String choice = scannerIn.nextLine().trim().toUpperCase();
      if (choice.equals("Q")) {
        System.out.println("Thank you for trying the US Crimes Statistics Program.");
        break; // end the loop when none is entered
      } //end if
      else {
        switch (choice) {
          case "1": crimes.getPopulationGrowth();
            break;
          case "2" : System.out.println(crimes.toString());
            break;
          case "3": System.out.printf("The Murder rate was highest in %d", crimes.getMaxMurder());
            break;
          case "4": System.out.printf("The Murder rate was lowest in %d", crimes.getMinMurder());
            break;
          case "5": System.out.printf("The Robbery rate was highest in %d", crimes.getMaxRobbery());
            break;
          case "6": System.out.printf("The Robbery rate was lowest in %d", crimes.getMinRobbery());
            break;
          case "7": System.out.printf("The Rape rate was highest in %d", crimes.getMaxRape());
            break;
          case "8": System.out.printf("The Rape rate was lowest in %d", crimes.getMinRape());
            break;
          case "9": System.out.printf("The Aggravated Assault rate was highest in %d", crimes.getMaxAssault());
            break;
          case "10": System.out.printf("The Aggravated Assault rate was lowest in %d", crimes.getMinAssault());
            break;
          case "11": System.out.printf("The Burglary rate was highest in %d", crimes.getMaxBurglary());
            break;
          case "12": System.out.printf("The Burglary rate was lowest in %d", crimes.getMinBurglary());
            break;
          case "13": System.out.printf("The Larceny theft was rate was highest in %d", crimes.getMaxLarceny());
            break;
          case "14": System.out.printf("The Larceny theft was lowest in %d", crimes.getMinLarceny());
            break;
          case "15": System.out.printf("The Motor Vehicle theft was rate was highest in %d", crimes.getMaxVehicleTheft());
            break;
          case "16": System.out.printf("The Motor Vehicle theft was lowest in %d", crimes.getMinVehicleTheft());
            break;
          case "17": crimes.printTotalAnnualCrime();
            break;
          case "18": crimes.printAnnualViolentCrime();
            break;
          case "19": crimes.getViolentCrimeChange();
            break;
          case "20": crimes.printAnnualPropertyCrime();
            break;
          case "21": crimes.getPropertyCrimeChange();
            break;
          default: System.out.println("Invalid selection, try again.");
            break;
        } // end switch
          
        
      } // end else
    } //end while
    
    scannerIn.close();
    
  } // end appMenu

} // end class
