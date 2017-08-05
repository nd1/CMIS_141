/*
* File: HeadPhone.java
* Author: Nicole Donnelly
* Date: 20170730
* Purpose: This program creates a class for headphones (homework3)
*/

public class HeadPhone {
  
  // declare constants for volume
  public static final int LOW = 1;
  public static final int MEDIUM = 2;
  public static final int HIGH = 3;
  
  // declare class data fields
  private int volume = MEDIUM;
  private boolean pluggedIn = false;
  private String manufacturer;
  private String headPhoneColor;
  private String headPhoneModel;
  
  // default constructor
  public HeadPhone() {
    this(MEDIUM, false, "NoBrand", "black", "NoModel");
  }
  
  //Full parameterized Constructor
  public HeadPhone(int volume, boolean pluggedIn, String manufacturer, 
      String headPhoneColor, String headPhoneModel) {
    this.volume = volume;
    this.pluggedIn = pluggedIn;
    this.manufacturer = manufacturer;
    this.headPhoneColor = headPhoneColor;
    this.headPhoneModel = headPhoneModel;
  }
  
  //Partial parameterized constructor
  public HeadPhone(String manufacturer, String headPhoneColor, String headPhoneModel) {
    this(MEDIUM, false, manufacturer, headPhoneColor, headPhoneModel);
  }

  // getter methods
  public int getVolume() {
    return volume;
  }
  
  public boolean getPluggedIn() {
    return pluggedIn;
  }
  
  public String getManufacturer() {
    return manufacturer;
  }
  
  public String getColor() {
    return headPhoneColor;
  }
  
  public String getModel() {
    return headPhoneModel;
  }
  
  // setter methods
  public void setVolume(int volume) {
    this.volume = volume;
  }
  
  public void setPluggedIn(boolean pluggedIn) {
    this.pluggedIn = pluggedIn;
  }
  
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
  
  public void setColor(String headPhoneColor) {
    this.headPhoneColor = headPhoneColor;
  }
  
  public void setModel(String headPhoneModel) {
    this.headPhoneModel = headPhoneModel;
  }
  
  // change volume method
  public int changeVolume(int newVolume) {
    this.volume = newVolume;
    return volume;
  }
  
  // string method
  public String toString () {
    return String.format("\nHeadPhone volume: %d"
        + "\nHeadPhone plugged in: %s"
        + "\nHeadPhone manufacturer: %s"
        + "\nHeadPhone color: %s"
        + "\nHeadPhone model: %s", this.volume, this.pluggedIn,
        this.manufacturer, this.headPhoneColor, this.headPhoneModel);
  }
  
} // end class
