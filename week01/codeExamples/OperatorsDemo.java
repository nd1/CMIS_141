/**
 * Print Experiment.
 */
public class OperatorsDemo 
{	
    public static void main(String[] args) 
     { 
        System.out.println("Math Operators Demo");
        
        // Place holders to store calculation
        double results = 0.0;
        int intresults = 0;

        // Addition (+)
        results = 4.1 + 8.1;
        System.out.println("4.1 + 8.1 = " + results);
        results = 4.1 + 10.5;
        System.out.println("4.1 + 10.5 = " + results);

        //  Subtraction (-)
        results = 4.1 - 8.1;
        System.out.println("4.1 - 8.1 = " + results);
        results = 4.1 - 10.5;
        System.out.println("4.1 - 10.5 = " + results);

	// Multiplication (*) 
        results = 4.1 * 8.1;
        System.out.println("4.1 * 8.1 = " + results);
        results = 4.1 * 10.5;
        System.out.println("4.1 * 10.5 = " + results);

	// Division (/)
        results = 4.1 / 8.1;
        System.out.println("4.1 / 8.1 = " + results);
        results = 4.1 / 10.5;
        System.out.println("4.1 / 10.5 = " + results);

	// Modulus (%)
        intresults = 20 % 3;
        System.out.println("20 % 3 = " + intresults);
        intresults = 20 % 5;
        System.out.println("20 % 5 = " + intresults);
         

 	// Precedence groupings 
       System.out.println("\n");   // New Line to separate Output
       System.out.println("*****Precedence Groupings*****");     
       results = 8.1 / 10.5 + 4.1 * 4.1 + 20;
       System.out.println("8.1 / 10.5 + 4.1 * 4.1 + 20 = " + results); 
       results = 8.1 / 10.5 + 4.1 * (4.1 + 20);
       System.out.println("8.1 / 10.5 + 4.1 * (4.1 + 20) = " + results);       
       results = 20 % 3 / 10.5 + 3 / (4.1 * 20 % 5);
       System.out.println("20 % 3 / 10.5 + 3 / (4.1 * 20 % 5) = " + results);  
       System.out.println("*****************************");  
        System.out.println("\n"); 

       // Unary Operators       
       // Variables for demonstrating Unary Operators
        System.out.println("*****Unary Operators*****");  
        int varA = 20;
        int varB = 3;
        int varC = 5;
        int varD = 10;

        // Post Increment (++)
        intresults = varA++;      
        System.out.println("varA++ = " + intresults);
       
       // Pre increment (++)
       intresults = ++varB;
       System.out.println("++varB = " + intresults);

       // Post decrement (--)
       intresults = varC--;
       System.out.println("varC-- = " + intresults);

       // Pre decrement (--)
       intresults = --varD;
       System.out.println("--varD = " + intresults);

       // Not Operator (!)
       // This should be true since 20 >= 3
       boolean flag = (20 >= 3);
       System.out.println("(20 >= 3) = " + flag);
       // This should be false since ! inverts the boolean value
       flag = !(20 >= 3);
       System.out.println("!(20 >= 3) = " + flag);
       System.out.println("*****************************");  
       System.out.println("\n"); 

	// Equality Operators
        // Equality (==)
       // 20 is not equal to 3 so flag should be false.
       System.out.println("*****Equality Operators*****");  
       flag = (20 == 3);
       System.out.println("(20 == 3) = " + flag);
        flag = (20 / 4 == 5);
       System.out.println("(20 / 4 == 5) = " + flag);

        // Not Equal (!=)
       // 20 is not equal to 3 so flag should be true.
       flag = (20 != 3);
       System.out.println("(20 != 3) = " + flag);
        flag = (20 / 4 != 5);
       System.out.println("(20 / 4 != 5) = " + flag);

        // Greater than (>)
        // 20 is greater than3 so flag should be true.
       flag = (20 > 3);
       System.out.println("(20 > 3) = " + flag);
        flag = (20 / 4 > 5);
       System.out.println("(20 / 4 > 5) = " + flag);
      
        // Greater than or equal to (>=)
        // 20 is not equal to 3 so flag should be false.
       flag = (20 >= 3);
       System.out.println("(20 >= 3) = " + flag);
       flag = (20 / 4 >= 5);
       System.out.println("(20 / 4 >= 5) = " + flag);
        
 	// Less than (<)
        // 20 is not less than 3 so flag should be false.
       flag = (20 < 3);
       System.out.println("(20 < 3) = " + flag);
        flag = (20 / 4 < 5);
       System.out.println("(20 / 4 < 5) = " + flag);

	// Less than or equal (<=)
        // 20 is not less than or equal so 3 so flag should be false.
       flag = (20 <= 3);
       System.out.println("(20 <= 3) = " + flag);
        flag = (20 / 4 <= 5);
       System.out.println("(20 / 4 <= 5) = " + flag);
        System.out.println("*****************************");  
       System.out.println("\n");

	// Conditional Operators
        // And (&&)
        System.out.println("*****Conditional Operators*****");
        flag = (20 == 20 ) && (15 >= 1) ;
        System.out.println ("(20 == 20 ) && (15 >= 1) = " + flag); 
        flag = (20 == 20 ) || (15 >= 1) ;
        System.out.println ("(20 == 20 ) || (15 >= 1) = " + flag); 

        // Conditional Operators can become complex
	// this can be tricky and precedence rules are critical
	// for this && is evaluated before ||. So all && are evaluated first.
        flag = (20 == 20 ) && (15 >= 1) || (true == false) && (1 == 4);
        System.out.println ("(20 == 20 ) && (15 >= 1) || (true == false) && (1 == 4) = " + flag); 
        System.out.println("*****************************");  
       System.out.println("\n");

	// Bitwise Operators
        System.out.println("*****Bitwise Operators*****");
        int mask = 0b1111;
        int val =  0b0011; 
        int val2 = 0b1100;
        int hmask = 0x0004;
        int hval =  0x0008;      
        int hval2 =  0x000A;     
	// Apply the & to each bit
        System.out.println (" 0b0011 & 0b1111 = " + (val & mask) );
        System.out.println (" ob1100 & 0b1111 = " + (val2 & mask) );
       // Apply the | to each bit
        System.out.println ("0b0011 | 0b1111 = " + (val | mask) );
        System.out.println ("0b1100 | 0b1111 = " + (val2 | mask) );
       // Apply the & to each bit
        System.out.println ("0x0008 & 0x0004 = " + (hval & hmask) );
        System.out.println ("0x0008 & 0x0004 = " + (hval2 & hmask) );
       // Apply the | to each bit
       System.out.println ("0x000A | 0x0004 = " + (hval | hmask) );
       System.out.println ("0x000A | 0x0004 = " + (hval2 | hmask) );
       System.out.println("*****************************");  
       System.out.println("\n");

     }
}