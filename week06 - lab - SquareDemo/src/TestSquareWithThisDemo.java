
/*
* File: TestSquareWithThisDemo.java
* Author: Nicole Donnelly
* Date: 20170729
* Purpose: This program constructs instances
* of the SquareDemo
*/

public class TestSquareWithThisDemo {  
    public static void main(String[] args)  { 

    // Construct a default square
      SquareWithThisDemo squareOne = new SquareWithThisDemo();

    // Call the get values
    System.out.println("Square One is: " + 
                squareOne.getlength());
        System.out.println("Number Square is: " + 
               SquareDemo.getNumSquares());
    System.out.println("Square One Area is: " + 
               String.format("%.2f", squareOne.getArea()));
    System.out.println("Square One Perimeter is: " + 
        String.format("%.2f", squareOne.getPerimeter()));

    // Construct another Square
    SquareWithThisDemo squareTwo = new SquareWithThisDemo(2.0);
    System.out.println("Square Two is: " + 
        squareTwo.getlength());
    System.out.println("Number Square is: " + 
        SquareWithThisDemo.getNumSquares());
    System.out.println("Square Two Area is: " + 
       String.format("%.2f", squareTwo.getArea()));
    System.out.println("Square Two Perimeter is: " + 
       String.format("%.2f", squareTwo.getPerimeter()));
    
    // Construct another Square
    SquareWithThisDemo squareThree = new SquareWithThisDemo(2.0);
    System.out.println("Square Three is: " + 
        squareThree.getlength());
    System.out.println("Number Square is: " + 
        SquareWithThisDemo.getNumSquares());
    System.out.println("Square Three Area is: " + 
       String.format("%.2f", squareThree.getArea()));
    System.out.println("Square Three Perimeter is: " + 
       String.format("%.2f", squareThree.getPerimeter()));   

    // Construct another Square
    SquareWithThisDemo squareFour = new SquareWithThisDemo(3.5);
    System.out.println("Square Four is: " + 
        squareFour.getlength());
    System.out.println("Number Square is: " + 
        SquareWithThisDemo.getNumSquares());
    System.out.println("Square Four Area is: " + 
       String.format("%.2f", squareFour.getArea()));
    System.out.println("Square Three Perimeter is: " + 
       String.format("%.2f", squareFour.getPerimeter()));   
    
    // Construct another Square
    SquareWithThisDemo squareFive = new SquareWithThisDemo(4.9);
    System.out.println("Square Five is: " + 
        squareFive.getlength());
    System.out.println("Number Square is: " + 
        SquareWithThisDemo.getNumSquares());
    System.out.println("Square Five Area is: " + 
       String.format("%.2f", squareFive.getArea()));
    System.out.println("Square Three Perimeter is: " + 
       String.format("%.2f", squareFive.getPerimeter()));  
    
    // Change length of square five
    squareFive.setLength(2.2);
    System.out.println("Square Five is now: " + 
        squareFive.getlength());
    System.out.println("Number Square is: " + 
        SquareWithThisDemo.getNumSquares());
    System.out.println("Square Five Area is: " + 
       String.format("%.2f", squareFive.getArea()));
    System.out.println("Square Three Perimeter is: " + 
       String.format("%.2f", squareFive.getPerimeter()));  
    }
}
