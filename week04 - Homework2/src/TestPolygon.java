/* File: TestPolygon.java
 * Author: Nicole Donnelly
 * Date: 20170714
 * Purpose:  constructs instances the Polygon class and uses the methods
 */

import java.util.ArrayList;
import java.util.List;

public class TestPolygon {
  public static void main(String[] args)  {

    // construct 5 test polygons
    Polygon p1 = new Polygon(3, 2.0, 1.0, 1.0);
    Polygon p2 = new Polygon();
    Polygon p3 = new Polygon(4, 3.0, 0.0789, -1.0);
    Polygon p4 = new Polygon(10, 7.9, 0.0, 0.0);
    Polygon p5 = new Polygon(5, 8.2, -2.07687, 1.06798);

    // create an list for the polygon parameters
    List<Polygon> polygonList = new ArrayList<Polygon>();

    // add the polygons to the list
    polygonList.add(p1);
    polygonList.add(p2);
    polygonList.add(p3);
    polygonList.add(p4);
    polygonList.add(p5);

    // iterate though the polygon list to test the class and methods
    for (Polygon currentPoly : polygonList) {
      System.out.println();
      System.out.println("toString(): " + currentPoly.toString());
      System.out.println("getNumSides(): " + currentPoly.getNumSides());
      System.out.println("getSideLength(): " + currentPoly.getSideLength());
      System.out.println("getXCoord(): " + currentPoly.getXCoord());
      System.out.println("getYCoord(): " + currentPoly.getYCoord());
      System.out.println("getPerimeter(): " + currentPoly.getPerimeter(currentPoly.getNumSides(),
          currentPoly.getSideLength()));
    } // end for loop


  } // end main

} // end class
