package MathDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathDemoABSTest {

  @Test
  public void test() {
    int testAbsVal = MathDemoABS.absValOut();
    assertTrue(testAbsVal == 175);
  }

}
