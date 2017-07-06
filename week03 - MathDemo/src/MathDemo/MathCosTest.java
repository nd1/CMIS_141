package MathDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathCosTest {

  @Test
  public void test() {
    double testCos = MathDemoABS.mathCos();
    assertTrue(testCos == -1.0);
  }

}
