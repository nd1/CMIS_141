/*
 * File: TestPoolHeater.java
 * Author: Nicole Donnelly
 * Date: 20170730
 * Purpose: Test Ed Henson's pool heater class
 */
public class TestPoolHeater {
  
  public static void main(String[] args) {
    
    // default instance
    PoolHeater defaultHeater = new PoolHeater();
    System.out.println("The default pool heater.");
    System.out.println(defaultHeater.toString());
    
    // my instance
    System.out.println("\nMy pool heater.");
    PoolHeater myHeater = new PoolHeater(68, 71, true, 4);
    System.out.println(myHeater.toString());
    
    // use the add time method
    System.out.println("\nAdding Time");
    myHeater.addTime(2);
    System.out.println(myHeater.toString());
    
    
  }

}
