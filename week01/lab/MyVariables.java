/***
Initialize and print variables.
*/
public class MyVariables
{
  public static void main(String[] args)
  {
    // Declare and initialize primitive variables
    boolean myTrue = true;
    boolean myFalse = false;
    double myDouble = 32.932;
    double otherDouble = 57.9684;
    int myInt = 20000;
    int otherInt = 74836;
    char firstChar = 'N';
    char otherChar = 'D';
    int hexInt =  0x002;
    int binaryInt =  0b110;
    int anotherInt = 74_836;

    // Declare a constant to hold Speed of Sound
    final double SPEEDOFSOUND = 343.6;

    // Print Variable name and value
    System.out.println("myTrue: " + myTrue);
    System.out.println("myFalse: " + myFalse);
    System.out.println("myDouble: " + myDouble);
    System.out.println("otherDouble: " + otherDouble);
    System.out.println("myInt: " + myInt);
    System.out.println("otherInt: " + otherInt);
    System.out.println("firstChar: " + firstChar);
    System.out.println("otherChar: " + otherChar);
    System.out.println("hexInt: " + hexInt);
    System.out.println("binaryInt: " + binaryInt);
    System.out.println("anotherInt: " + anotherInt);
  }
}
