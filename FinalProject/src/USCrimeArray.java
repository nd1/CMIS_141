/*
* File: USCrimeArray.java
* Author: Nicole Donnelly
* Date: 20170813
* Purpose: Create an array of USCrimeClass. Create different methods to work with the array data.
* Code presumes data in provided csv file follows a known format and includes a header.
* The length of the file can be variable in the event future data is added.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class USCrimeArray {

  private USCrimeClass[] crimes;
  
  // create an array of crime data given contents of a file
  public USCrimeArray(String dataFile) {
    
    BufferedReader inputStream = null;
    String fileLine;
    int fileRow = 0;
    int index = 0;
    
    int rowCount = countRows(dataFile);  // determine how many rows of data in the file
    this.crimes = new USCrimeClass[rowCount]; // instantiate the array
    
    try {
      // read the data, create a USCrimeClass object with each row and add to the array
      inputStream = new BufferedReader(new FileReader(dataFile));
      while((fileLine = inputStream.readLine() ) != null) {
        if (fileRow == 0) {
          fileRow++; // skip the header row, increment the counter to proceed to array creation
        } // end if
        else {
          this.crimes[index] = new USCrimeClass(fileLine);
          index++;
        } // end else
      } // end while
    } // end try 
    catch (IOException io) {
      System.out.println("File IO exception" + io.getMessage());
      } // end catch
    finally {
      // Need another catch for closing          
      try {
          // Close the stream
          if (inputStream != null) {
          inputStream.close();
          } // end if
       } // end try 
      catch (IOException io) {
          System.out.println("Issue closing the Files" + io.getMessage());
      }// end catch
      
    } // end finally
    
    } // end USCrimeArray
  
  
  // method to determine the length of the file
  private static int countRows(String dataFile) {
    
    // count the rows in the file
    BufferedReader inputStream = null;
    String fileLine;
    int rowCount = 0;
    
    try {
      // count rows in file 
      inputStream = new BufferedReader(new FileReader(dataFile));
      while ((fileLine = inputStream.readLine() ) != null) {
          rowCount++;
       } // end while 
    } // end try
    catch (IOException io) {
      System.out.println("File IO exception" + io.getMessage());
      } // end catch
    finally {
      // Need another catch for closing          
      try {
          // Close the stream
          if (inputStream != null) {
          inputStream.close();
          } // end if
       } // end try 
      catch (IOException io) {
          System.out.println("Issue closing the Files" + io.getMessage());
      }// end catch
      
    } // end finally
    return rowCount;
    } // end coutRows
  
  // population growth
  public void getPopulationGrowth() {
    for (int i=0; i<(crimes.length-2); i++) {
      System.out.printf("\n%d - %d: %.4f%%", crimes[i].getYear(), crimes[i+1].getYear(),
          ((crimes[i+1].getPopulation() - crimes[i].getPopulation())/(float)crimes[i].getPopulation())*100
          );
    } // end for
  } //end getPopulationGrowth
  
  // violent crime change
  public void getViolentCrimeChange() {
    for (int i=0; i<(crimes.length-2); i++) {
      System.out.printf("\n%d - %d: %.1f%%", crimes[i].getYear(), crimes[i+1].getYear(),
          ((crimes[i+1].getViolentCrimeRate() - crimes[i].getViolentCrimeRate())/crimes[i].getViolentCrimeRate())*100);
    } // end for
  } //end getViolentCrimeChange
  
  // property crime change
  public void getPropertyCrimeChange() {
    for (int i=0; i<(crimes.length-2); i++) {
      System.out.printf("\n%d - %d: %.1f%%", crimes[i].getYear(), crimes[i+1].getYear(),
          ((crimes[i+1].getPropertyCrimeRate() - crimes[i].getPropertyCrimeRate())/crimes[i].getPropertyCrimeRate())*100);
    } // end for
  } //end getPropertyCrimeChange
  
  // year of max murder rate
  public int getMaxMurder() {
    double murderRate = crimes[0].getMurderManslaughterRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getMurderManslaughterRate() > murderRate) {
        murderRate = crimes[i].getMurderManslaughterRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMaxMurder
  
  // year of min murder rate
  public int getMinMurder() {
    double murderRate = crimes[0].getMurderManslaughterRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getMurderManslaughterRate() < murderRate) {
        murderRate = crimes[i].getMurderManslaughterRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMinMurder
  
  //year of max robbery rate
  public int getMaxRobbery() {
    double robberyRate = crimes[0].getRobberyRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getRobberyRate() > robberyRate) {
        robberyRate = crimes[i].getRobberyRate();
        crimeIndex = i;
     } // end if
   } // end for
    return crimes[crimeIndex].getYear();
  } // end getMaxRobbery
 
  // year of min robbery rate
  public int getMinRobbery() {
    double robberyRate = crimes[0].getRobberyRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getRobberyRate() < robberyRate) {
        robberyRate = crimes[i].getRobberyRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMinRobbery
 
  //year of max rape rate
  public int getMaxRape() {
    double rapeRate = crimes[0].getRapeRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getRapeRate() > rapeRate) {
        rapeRate = crimes[i].getRapeRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMaxRape

  // year of min rape rate
  public int getMinRape() {
    double rapeRate = crimes[0].getRapeRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getRapeRate() < rapeRate) {
        rapeRate = crimes[i].getRapeRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMinRape
  
  //year of max assault rate
  public int getMaxAssault() {
    double assaultRate = crimes[0].getAggravatedAssaultRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getAggravatedAssaultRate() > assaultRate) {
        assaultRate = crimes[i].getAggravatedAssaultRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMaxAssault

  // year of min assault rate
  public int getMinAssault() {
    double assaultRate = crimes[0].getAggravatedAssaultRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getAggravatedAssaultRate() < assaultRate) {
        assaultRate = crimes[i].getAggravatedAssaultRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMinAssault
  
//year of max burglary rate
  public int getMaxBurglary() {
    double burglaryRate = crimes[0].getBurglaryRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getBurglaryRate() > burglaryRate) {
        burglaryRate = crimes[i].getBurglaryRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMaxBurglary

  // year of min Burglary rate
  public int getMinBurglary() {
    double burglaryRate = crimes[0].getBurglaryRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getBurglaryRate() < burglaryRate) {
        burglaryRate = crimes[i].getBurglaryRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMinBurglary
  
  //year of max larceny rate
  public int getMaxLarceny() {
    double larcenyRate = crimes[0].getLarcenyTheftRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getLarcenyTheftRate() > larcenyRate) {
        larcenyRate = crimes[i].getLarcenyTheftRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMaxLarceny

  // year of min larceny rate
  public int getMinLarceny() {
    double larcenyRate = crimes[0].getLarcenyTheftRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getLarcenyTheftRate() < larcenyRate) {
        larcenyRate = crimes[i].getLarcenyTheftRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMinLarceny
  
  //year of max vehicle theft rate
  public int getMaxVehicleTheft() {
    double vehicleRate = crimes[0].getMotorVehicleTheftRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getMotorVehicleTheftRate() > vehicleRate) {
        vehicleRate = crimes[i].getMotorVehicleTheftRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMaxVehicleTheft

  // year of min vehicle theft rate
  public int getMinVehicleTheft() {
    double vehicleRate = crimes[0].getMotorVehicleTheftRate();
    int crimeIndex = 0;

    for (int i=0; i<(crimes.length-1); i++) {
      if (crimes[i].getMotorVehicleTheftRate() < vehicleRate) {
        vehicleRate = crimes[i].getMotorVehicleTheftRate();
        crimeIndex = i;
      } // end if
    } // end for
    return crimes[crimeIndex].getYear();
  } // end getMinVehicleTheft
  
  // print the total number of crimes per year
  public void printTotalAnnualCrime() {
    // total annual crime is (violent crime + property crime)
    for (int i=0; i<(crimes.length-1); i++) {
      System.out.printf("\n%d : %,8d", crimes[i].getYear(), 
          (crimes[i].getViolentCrime() + crimes[i].getPropertyCrime()));
    } // end for
  } //end printTotalAnnualCrime
  
  // print annual violent crime
  public void printAnnualViolentCrime() {
    for (int i=0; i<(crimes.length-1); i++) {
      System.out.printf("\n%d : %,8d", crimes[i].getYear(), crimes[i].getViolentCrime());
    } // end for
  } //end printAnnualViolentCrime
  
  //print annual property crime
  public void printAnnualPropertyCrime() {
    for (int i=0; i<(crimes.length-1); i++) {
      System.out.printf("\n%d : %,8d", crimes[i].getYear(), crimes[i].getPropertyCrime());
    } // end for
  } //end printAnnualPropertyCrime

  // toSting
  public String toString() {
    return Arrays.toString(this.crimes);
  }

} // end class
