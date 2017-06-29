/* File: UMUC_Months3.java
 * Author: Instructor
 * 
 * Update: 20170628, Nicole Donnelly
 * 
 * Purpose: demonstrates the use of an if/else statement
 * and create a test for the code.
 */

public class UMUC_Months3 {
   public static void main(String[] args) {
      daysInMonth();
   } // end main

public static Integer daysInMonth() {
	int month = 7, days = 0;

      if ((month == 1) ||
         (month == 3) || 
         (month == 5) || 
         (month == 7) || 
         (month == 8) || 
         (month == 10) || 
         (month == 12)) 
         days = 31; 
      else if ((month == 4) || 
         (month == 6) || 
         (month == 9) ||
         (month == 11)) 
         days = 30;
      else if (month == 2)
         days = 28; 
      else {
         System.out.println("month is invalid");
         days = 0;
      }
      System.out.println("days = " + days);
      return days;
}
} // end class