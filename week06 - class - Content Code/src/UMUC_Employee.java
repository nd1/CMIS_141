/* File:    UMUC_Employee.java
 * Author:  InstructorX
 * Date:    dd-mm-yyyy
 * Purpose: shows the difference between a static variable
 *          and an instance variable
 */

public class UMUC_Employee {
   private static int numberOfEmployees = 0;
   private int employeeId = 0;

   public UMUC_Employee() {
      employeeId = ++numberOfEmployees;
   } // end method

   public int getEmployeeId() {
      return employeeId;
   } // end method

   public static void main(String args[]) {
     UMUC_Employee emp2 = new UMUC_Employee();
     UMUC_Employee emp1 = new UMUC_Employee();
      

      System.out.println("emp1 id is " + emp1.getEmployeeId()); // OUTPUT
      System.out.println("emp2 id is " + emp2.getEmployeeId()); // OUTPUT
      System.out.println("total number of employees is " +
                          UMUC_Employee.numberOfEmployees);     // OUTPUT
   } // end method
} // end class