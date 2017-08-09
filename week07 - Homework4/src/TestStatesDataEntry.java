/*
* File: TestStatesDataEntry.java
* Author: Nicole Donnelly
* Date: 20170806
* Purpose: Test class for the StateBirdFlower class. 
*/
public class TestStatesDataEntry {

  public static void main(String[] args) {
    // create an array of values to test
    String [] testStates = {"not a state", //test a random string
                      "   new YoRK", // leading spaces, random capitalization
                      "delAWare   ", // trailing spaces, random capitalization
                      "",           // empty string
                      "mar Y LA  nd  ", // random spaces and capitalization
                      "New Jersey",     // two word state name
                      "nONe"        // none to end the test cases
    }; // end string
    
    // create a String Buffer to store results
    StringBuffer allResults = new StringBuffer();
    
    for (int i=0; i<testStates.length; i++) {

        System.out.println("\nEnter a State or None to exit: ");
        // read the next line, normalize the string for comparison
        String newState = testStates[i].trim().replace(" ", "").toLowerCase();
        if (newState.equals("none")) {
          break; // end the loop when none is entered
        } //end if
        
        StateBirdFlower state = new StateBirdFlower(newState);
        System.out.println(state.toString());
        
        // append the results to the string buffer
        allResults.append(String.format("%s, %s, %s\n", state.getStateName(),
            state.getStateBird(), state.getStateFlower()));

    } // end for
    // print results
    System.out.println("**** Thank you *****");
    System.out.println("A summary report for each State, Bird, and Flower is:");
    System.out.println(allResults);
    System.out.println("Please visit our site again!");
    
  } // end main

} // end class
