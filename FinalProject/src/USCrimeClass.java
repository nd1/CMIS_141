/*
* File: USCrimeClass.java
* Author: Nicole Donnelly
* Date: 20170813
* Purpose: Create a class to store crime data fields from a CSV file of known format.
*/

import java.util.Scanner;

public class USCrimeClass {
  
  // create an object that stores crime data with the following fields
  private int year = 1900;
  private int population = 0;
  private int violentCrime = 0;
  private double violentCrimeRate = 0.0;
  private int murderManslaughter = 0;
  private double murderManslaughterRate = 0.0;
  private int rape = 0;
  private double rapeRate = 0.0;
  private int robbery = 0;
  private double robberyRate = 0.0;
  private int aggravatedAssault = 0;
  private double aggravatedAssaultRate = 0.0;
  private int propertyCrime = 0;
  private double propertyCrimeRate = 0.0;
  private int burglary = 0;
  private double burglaryRate = 0.0;
  private int larcenyTheft = 0;
  private double larcenyTheftRate = 0.0;
  private int motorVehicleTheft  = 0;
  private double motorVehicleTheftRate = 0.0;
  
  // default constructor
  public USCrimeClass() {
    // use default values 
  }
  
  // constructor using a string of values
 
  /* eclipse improperly detects a resource leak with "useDelimiter"
   * @SuppressWarnings added per StackOverflow disucssion on the topic
   * https://stackoverflow.com/questions/11463327/is-this-a-memory-leak-or-a-false-positive
   */
  
  @SuppressWarnings("resource")
  
  public USCrimeClass(String arguments) {
    Scanner scanArg = null;
    scanArg = new Scanner(arguments).useDelimiter(",\\s*");
    
    this.year = (scanArg.nextInt());
    this.population = (scanArg.nextInt());
    this.violentCrime = (scanArg.nextInt());
    this.violentCrimeRate = (scanArg.nextDouble());
    this.murderManslaughter = (scanArg.nextInt());
    this.murderManslaughterRate = (scanArg.nextDouble());
    this.rape = (scanArg.nextInt());
    this.rapeRate = (scanArg.nextDouble()); 
    this.robbery = (scanArg.nextInt());
    this.robberyRate = (scanArg.nextDouble());
    this.aggravatedAssault = (scanArg.nextInt());
    this.aggravatedAssaultRate  = (scanArg.nextDouble());
    this.propertyCrime = (scanArg.nextInt());
    this.propertyCrimeRate = (scanArg.nextDouble());
    this.burglary = (scanArg.nextInt());
    this.burglaryRate = (scanArg.nextDouble());
    this.larcenyTheft = (scanArg.nextInt());
    this.larcenyTheftRate = (scanArg.nextDouble());
    this.motorVehicleTheft = (scanArg.nextInt());
    this.motorVehicleTheftRate  = (scanArg.nextDouble());
    
    scanArg.close();
  }
  
  // getter methods
  public int getYear() { 
    return year; 
    }
  
  public int getPopulation() { 
    return population; 
    }
  
  public int getViolentCrime() { 
    return violentCrime; 
    }
  
  public double getViolentCrimeRate() { 
    return violentCrimeRate; 
    }
  
  public int getMurderManslaughter() { 
    return murderManslaughter; 
    }
  
  public double getMurderManslaughterRate() { 
    return murderManslaughterRate; 
    }
  
  public int getRape() { 
    return rape; 
    }
  
  public double getRapeRate() { 
    return rapeRate; 
    }
  
  public int getRobbery() { 
    return robbery; 
    }
  
  public double getRobberyRate() { 
    return robberyRate; 
    }
  
  public int getAggravatedAssault() { 
    return aggravatedAssault; 
    }
  
  public double getAggravatedAssaultRate() { 
    return aggravatedAssaultRate; 
    }
  
  public int getPropertyCrime() { 
    return propertyCrime; 
    }
  
  public double getPropertyCrimeRate() { 
    return propertyCrimeRate; 
    }
  
  public int getBurglary() { 
    return burglary; 
    }
  
  public double getBurglaryRate() { 
    return burglaryRate; 
    }
  
  public int getLarcenyTheft() { 
    return larcenyTheft; 
    }
  
  public double getLarcenyTheftRate() { 
    return larcenyTheftRate; 
    }
  
  public int getMotorVehicleTheft() { 
    return motorVehicleTheft; 
    }
  
  public double getMotorVehicleTheftRate() { 
    return motorVehicleTheftRate; 
    }
  
  // setter methods
  // crime objects are immutable using values from the csv so no setter methods are defined.

  // toString method
  public String toString() {
    return String.format("\n\nYear: %d "
        + "\nPopulation: %d"
        + "\nViolent Crime: %d"
        + "\nViolent Crime Rate: %.2f"
        + "\nMurder and nonnegligent manslaughter: %d"
        + "\nMurder and nonnegligent manslaughter rate: %.2f"
        + "\nRape: %d"
        + "\nRape rate: %.2f"
        + "\nRobbery: %d"
        + "\nRobbery rate: %.2f"
        + "\nAggravated assault: %d"
        + "\nAggravated assault rate: %.2f"
        + "\nProperty crime: %d"
        + "\nProperty crime rate: %.2f"
        + "\nBurglary: %d"
        + "\nBurglary rate: %.2f"
        + "\nLarceny-theft: %d"
        + "\nLarceny-theft rate: %.2f"
        + "\nMotor vehicle theft: %d"
        + "\nMotor vehicle theft rate: %.2f", year, population, violentCrime, violentCrimeRate, 
      murderManslaughter, murderManslaughterRate, rape, rapeRate, robbery, robberyRate, 
      aggravatedAssault, aggravatedAssaultRate, propertyCrime, propertyCrimeRate, burglary, 
      burglaryRate, larcenyTheft, larcenyTheftRate, motorVehicleTheft, motorVehicleTheftRate);
  } // end toString
  
} // end class
