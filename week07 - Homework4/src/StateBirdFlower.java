/*
* File: StateBirdFlower.java
* Author: Nicole Donnelly
* Date: 20170806
* Purpose: Create a class for state objects. Each state object
* consists of a name, bird, and flower.
*/

public class StateBirdFlower {
  
  // create constants
  private final int STATE_NAME = 0;
  private final int STATE_BIRD = 1;
  private final int STATE_FLOWER = 2;
  
  // class data fields
  private String stateName;
  private String stateBird;
  private String stateFlower;
  
  // array of data to create objects
  private String [][] stateData = {
      {"Alabama", "Yellowhammer", "Camellia"},
      {"Alaska", "Willow Ptarmigan", "Forget-me-not"},
      {"Arizona", "Cactus Wren", "Saguaro Cactus Blossom"},
      {"Arkansas", "Mockingbird", "Apple Blossom"},
      {"California", "California Valley Quail", "Golden Poppy"},
      {"Colorado", "Lark Bunting", "Columbine"},
      {"Connecticut", "American Robin", "Mountain Laurel"},
      {"Delaware", "Blue Hen Chicken", "Peach Blossom"},
      {"Florida", "Mockingbird", "Orange Blossom"},
      {"Georgia", "Brown Thrasher", "Cherokee Rose"},
      {"Hawaii", "Nene (Hawaiian Goose)", "Hibiscus"},
      {"Idaho", "Mountain Bluebird", "Syringa"},
      {"Illinois", "Cardinal", "Native violet"},
      {"Indiana", "Cardinal", "Peony"}, 
      {"Iowa", "Eastern Goldfinch", "Wild Rose"},
      {"Kansas", "Western Meadowlark", "Native Sunflower"},
      {"Kentucky", "Kentucky Cardinal", "Goldenrod"},
      {"Louisiana", "Pelican", "Magnolia"},
      {"Maine", "Chickadee", "White Pine Cone and Tassel"},
      {"Maryland", "Baltimore Oriole", "Black-Eyed Susan"},
      {"Massachusetts", "Chickadee", "Mayflower"},
      {"Michigan", "Robin", "Apple Blossom"},
      {"Minnesota", "Common Loon", "Pink and White Lady's Slipper"},
      {"Mississippi", "Mockingbird", "Magnolia"},
      {"Missouri", "Bluebird", "Hawthorn"},
      {"Montana", "Western Meadowlark", "Bitterroot"},
      {"Nebraska", "Western Meadowlark", "Goldenrod"},
      {"Nevada", "Mountain Bluebird", "Sagebrush"},
      {"New Hampshire", "Purple Finch", "Purple Lilac"},
      {"New Jersey", "Eastern Goldfinch", "Purple Violet"},
      {"New Mexico", "Roadrunner", "Yucca Flower"},
      {"New York", "Bluebird", "Rose"},
      {"North Carolina", "Cardinal", "Dogwood"},
      {"North Dakota", "Western Meadowlark", "Wild Prairie Rose"},
      {"Ohio", "Cardinal", "Scarlet Carnation"},
      {"Oklahoma", "Scissor-Tailed Flycatcher", "Mistletoe"},
      {"Oregon", "Western Meadowlark", "Oregon Grape"},
      {"Pennsylvania", "Ruffed Grouse", "Mountain Laurel"},
      {"Rhode Island", "Rhode Island Red", "Violet"},
      {"South Carolina", "Carolina Wren", "Yellow Jessamine"},
      {"South Dakota", "Ring-Necked Pheasant", "American Pasqueflower"},
      {"Tennessee", "Mockingbird", "Iris"},
      {"Texas", "Mockingbird", "Bluebonnet"},
      {"Utah", "California Gull", "Sego Lily"},
      {"Vermont", "Hermit Thrush", "Red Clover"},
      {"Virginia", "Cardinal", "Dogwood"},
      {"Washington", "Willow Goldfinch", "Western Rhododendron"},
      {"West Virginia", "Cardinal", "Big Rhododendron"},
      {"Wisconsin", "Robin", "Wood Violet"},
      {"Wyoming", "Meadowlark", "Indian Paintbrush"},
      {"Washington DC", "Woodthrush", "American Beauty Rose"}
  };

  // default constructor
  public StateBirdFlower() {
    this.stateName = "Invalid Entry";
    this.stateBird = "No Data";
    this.stateFlower = "No Data";   
  }
  
  // constructor with user provided state only
  public StateBirdFlower(String userState) {
    this.stateName = getStateData(userState).getStateName();
    this.stateBird = getStateData(userState).getStateBird();
    this.stateFlower = getStateData(userState).getStateFlower();
  }
  
  // fully parameterized constructor
  public StateBirdFlower (String stateName, String stateBird, String stateFlower) {
    this.stateName = stateName;
    this.stateBird = stateBird;
    this.stateFlower = stateFlower;
  }
  
  // getter methods
  public String getStateName() {
    return stateName;
  }
  
  public String getStateBird() {
    return stateBird;
  }
  
  public String getStateFlower() {
    return stateFlower;
  }
  
  // setter methods
  public void setStateName(String stateName) {
    this.stateName = stateName;
  }
  
  public void setStateBird(String stateBird) {
    this.stateBird = stateBird;
  }
  
  public void setStateFlower(String stateFlower) {
    this.stateFlower = stateFlower;
  }
  
  // getIndex method - finds the index of a state
  public int getIndex(String stateInfo[][], String state) {
    for (int i = 0; i<stateInfo.length; i++) {
      if (stateInfo[i][STATE_NAME].replace(" ", "").toLowerCase().equals(state)) {
        return i;
        } // end if
      
      } // end for
    return -1;
    } // end getIndex
  
  // getStateData method - constructs a state when only name is passed to constructor
  public StateBirdFlower getStateData(String theState) {
    
    // create a StateBirdFlower to return
    StateBirdFlower state = new StateBirdFlower();
    // get the index value of the correct info in the array
    int stateIndex = getIndex(stateData, theState); 
    // if the state was not found, create a default state
    if (stateIndex == -1) {
      return state;
    }
    // if the state is found, set the values
    state.setStateName(stateData[stateIndex][STATE_NAME]);
    state.setStateBird(stateData[stateIndex][STATE_BIRD]);
    state.setStateFlower(stateData[stateIndex][STATE_FLOWER]);
    return state;
  }
  
  public String toString() {
    return String.format("\n%s"
        + "\nBird: %s"
        + "\nFlower: %s", this.stateName, this.stateBird, this.stateFlower);
  }
  
} // end class
