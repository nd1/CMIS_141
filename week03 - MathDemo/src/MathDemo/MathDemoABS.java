// code from http://www.tutorialspoint.com/
// practice unit testing

package MathDemo;

public class MathDemoABS {

   public static void main(String[] args) {

      absValOut();
      mathCeiling();
      mathCos();
      
   } // end main

  public static int absValOut() {
    // get some integers to find their absolute values
    int x = 175;
    int y = -184;
    int xAbsValOut = Math.abs(x);
  
    // get and print their absolute values
    System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
    System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
    System.out.println("Math.abs(-0)=" + Math.abs(-0));
    
    //return absolute value of x
    return(xAbsValOut);
  } // end absValOut
  
  public static double mathCeiling() {

    // get two double numbers
    double x = 125.9;
    double y = 0.4873;
    double xCeilingOut = Math.ceil(x);
    
    // call ceal for these these numbers
    System.out.println("Math.ceil(" + x + ")=" + Math.ceil(x));
    System.out.println("Math.ceil(" + y + ")=" + Math.ceil(y));
    System.out.println("Math.ceil(-0.65)=" + Math.ceil(-0.65));
    
    return xCeilingOut;
  
 } // end mathCeiling
  
  public static double mathCos() {
    // get two double numbers
    double x = 45.0;
    double y = 180.0;
    double yCosOut = Math.cos(Math.toRadians(y));
 
    // convert them to radians
    x = Math.toRadians(x);
    y = Math.toRadians(y);

    // print their cosine
    System.out.println("Math.cos(" + x + ")=" + Math.cos(x));
    System.out.println("Math.cos(" + y + ")=" + Math.cos(y));

    return yCosOut;
  }
  
} // end class