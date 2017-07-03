/* File: bottlesOfBeer.java
 * Author: Nicole Donnelly
 * Date: 20170703
 * Purpose: demonstrate use of a while loop by printing the lyrics to "99 Bottles of Beer"
 */

public class bottlesOfBeer {
  public static void main(String[] args) {
    
    // declare variables
    int bottlesOfBeer = 99;
    
    // execute loop while > 0
    while (bottlesOfBeer > 0) {
      
      // use String's static format() method for the lyrics
      String enoughBeer = String.format("\n%d bottles of beer on the wall, %d bottles of beer.", 
          bottlesOfBeer, bottlesOfBeer);
      String takeOneDown = String.format("Take one down and pass it around, %d bottles of beer on the "
          + "wall.", (bottlesOfBeer - 1));
      String lowBeer = String.format("Take one down and pass it around, %d bottle of beer on the "
          + "wall.", (bottlesOfBeer - 1));
      String lastBeer = String.format("\n%d bottle of beer on the wall, %d bottle of beer.", 
          bottlesOfBeer, bottlesOfBeer);
      
      if (bottlesOfBeer > 2) { // we have enough beer
        System.out.println(enoughBeer);
        System.out.println(takeOneDown);
      } //end if > 2
      
      else if (bottlesOfBeer == 2) { // we are on our last beer after this
        System.out.println(enoughBeer);
        System.out.println(lowBeer);
      } // end == 2
      
      else {  // this is the last beer
        System.out.println(lastBeer);
        System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
      } // end else
      
      bottlesOfBeer--; // decrease our beer count 
      
    } // end while
    
    // time to end the song
    System.out.print("\nNo more bottles of beer on the wall, no more bottles of beer."
    + "\nGo to the store and buy some more, 99 bottles of beer on the wall.");
  
  } // end main

} //end bottlesOfBeer
