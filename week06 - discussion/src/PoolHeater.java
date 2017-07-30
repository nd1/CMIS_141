/*
 * File: PoolHeater.java
 * Author: Ed Henson
 * Date: 20170729
 * Purpose: Creates a pool heater class
 */

public class PoolHeater {
	// Variables
	private int initialTemp;
	private int currentTemp;
	private int programmedTemp;
	private boolean isOn;
	private int startTime; // Hours since midnight
	private int elapsedTime;

	// Default Constructor
	public PoolHeater() {
		this.initialTemp = 78;
		this.currentTemp = this.initialTemp;
		this.programmedTemp = 86;
		this.isOn = true;
		this.startTime = 0;
	}
	// Constructor
	public PoolHeater(int initialTemp, int programmedTemp, boolean isOn, int startTime) {
		this.initialTemp = initialTemp;
		this.currentTemp = initialTemp;
		this.programmedTemp = programmedTemp;
		this.isOn = isOn;
		this.startTime = startTime;
	}

	// Setter Methods
	public void setInitialTemp(int initialTemp) {
		this.initialTemp = initialTemp;
	}
	public void setProgrammedTemp(int programmedTemp) {
		this.programmedTemp = programmedTemp;
	}
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	// Getter Methods
	public int getInitialTemp() {
		return initialTemp;
	}
	public int getProgrammedTemp() {
		return programmedTemp;
	}
	public boolean getIsOn() {
		return isOn;
	}
	public int getStartTime() {
		return startTime;
	}
	public int getElapsedTime() {
		return elapsedTime;
	}
	public int getCurrentTemp() {
		return currentTemp;
	}

	// Method to elapse time and change the current temp
	public void addTime(int hours) {
		elapsedTime += hours;
		if (isOn == true) {
			currentTemp = currentTemp + hours;
			currentTemp = Math.min(currentTemp, programmedTemp);
		}
	}

	// toString method
	public String toString() {
		String str = "Initial Temp: " + initialTemp + "\nProgrammed Temp: " + programmedTemp +
			"\nCurrent Temp: " + currentTemp + "\nIs On: " + isOn + "\nStart Time: " + startTime +
			"\nElapsed Time: " + elapsedTime;
			return str;
	}

	// Including method main for testing
	public static void main(String[] args) {
		PoolHeater pHeater = new PoolHeater();
		// Print out initial field values
		System.out.println("Initial Values");
		System.out.println(pHeater.toString());
		pHeater.addTime(6);
		System.out.println("Values after time");
		System.out.println(pHeater.toString());
		pHeater.addTime(6); // Temp shouldn't end up greater than 86
		System.out.println("Values after more time");
		System.out.println(pHeater.toString());
	}
}
