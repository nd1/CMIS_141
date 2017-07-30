/*
* File: TeaKettle.java
* Author: Nicole Donnelly
* Date: 20170730
* Purpose: This program creates a class for an electric tea kettle.
* The kettle can be on or off and open or closed.
* You can set the option to keep the water warm or not once it reaches temperature.
* There are multiple temperature settings in degrees F- 160 (delicate), 175 (green), 
* 185 (white), 190(oolong), 200(french press), 212 (boil).
* The kettle capacity is 1.7 L.
* (Temperature and capacity constraints are not enforced in this class.)
*/

public class TeaKettle {
  
  //Define class variables
  private boolean isOn = false;
  private boolean isOpen = true;
  private boolean keepWarm = false;
  private int tempSetting = 0;
  private double waterAmount = 0.0;
  
  
  // constructors
  public TeaKettle() {
    //default constructor
    this(false, true, false, 0, 0.0);
  }
  
  public TeaKettle(boolean isOn, boolean isOpen, boolean keepWarm, int tempSetting, 
      double waterAmount) {
    // Full parameterized Constructor
    this.isOn = isOn;
    this.isOpen = isOpen;
    this.keepWarm = keepWarm;
    this.tempSetting = tempSetting;
    this.waterAmount = waterAmount;
    }
  
  public TeaKettle(int tempSetting, double waterAmount) { 
    // constructor to make tea with specified temp and water amount
    this(true, false, true, tempSetting, waterAmount);
    this.tempSetting = tempSetting;
    this.waterAmount = waterAmount;
  }
  
  // getter methods
  public boolean getOn() {
    return isOn;
  }
  
  public boolean getOpen() {
    return isOpen;
  }
  
  public boolean getWarm() {
    return keepWarm;
  }
  
  public int getTemp() {
    return tempSetting;
  }
  
  public double waterAmount() {
    return waterAmount;
  }
  
  // setter methods
  public void setOn(boolean isOn) {
    this.isOn = isOn;
    }
 
  public void getOpen(boolean isOpen) {
    this.isOpen = isOpen;
    }
 
  public void setWarm(boolean keepWarm) {
    this.keepWarm = keepWarm;
  }
 
  public void setTemp(int tempSetting) {
    this.tempSetting = tempSetting;
  }
  
  public void setWater(double waterAmount) {
    this.waterAmount = waterAmount;
  }
  
  // string method
  public String toString () {
    return String.format("The kettle is on: %s"
        + "\nThe kettle is open: %s"
        + "\nThe warm setting is on: %s"
        + "\nThe temperature is set to %d℉"
        + "\nThere is %01.2f liters of water in the kettle.\n",
        this.isOn, this.isOpen, this.keepWarm, this.tempSetting, this.waterAmount);
  }

} // end class
