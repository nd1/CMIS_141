/* File:    UMUC_Employee.java
 * Author:  InstructorX
 * Date:    dd-mm-yyyy
 * Purpose: Implement a simple Employee class
 */

public class UMUC_Employee {
   private double payRate = 0.0;
   private double hoursWorked = 0.0;

   public UMUC_Employee() {
      payRate= 20.54;
      hoursWorked = 40.0;
   } // end method

   public void setPayRate(double rate) {
      payRate = rate;
   } // end method

   public double getPayRate() {
      return payRate;
   } // end method

   public void setHoursWorked(double hours) {
      hoursWorked = hours;
   } // end method

   public double getHoursWorked() {
      return hoursWorked;
   } // end method

   public double calculatePay() {
      double pay = payRate * hoursWorked;
      return pay;
   } // end method
   
} // end class