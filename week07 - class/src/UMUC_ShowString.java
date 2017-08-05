/* File:    UMUC_ShowString.java
 * Author:  InstructorX
 * Date:    dd-mm-yyyy
 * Purpose: Show some string functions
 */

public class UMUC_ShowString {
   public static void main(String args[]) {
      String s1 = new String("ABCDEF");
      String s2 = new String("UVWXYZ");

      // c1 is set to D, the character in
      // s1 at position 3
      char c1 = s1.charAt(3);
      System.out.println("c = " + c1); // OUTPUT

      // c1 is set to X, the character in
      // s2 at position 3
      c1 = s2.charAt(3);
      System.out.println("c = " + c1); // OUTPUT
          
      // s3 is set to CDE, a substring of s1 from
      // positions 2 to 5
      String s3 = s1.substring(2,5);
      System.out.println(s3);          // OUTPUT
      
   } // end method
} // end class