package MathDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathCeilingTest {

  @Test
  public void test() {
    double testCeilValue = MathDemoABS.mathCeiling();
    assertTrue(testCeilValue == 126.0);
  }

}
